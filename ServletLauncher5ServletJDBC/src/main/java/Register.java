

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//In this we are going to take the input parameters from servlet and store it in database

//Prerequisites
	// Add mySQL jar file to Classpath
	// WE NEED TO ADD IT TO DEPLOYMENT ASSEMBLY(WEB DA since it need to accessed by server) ALSO AS IT IS WEB APPLICATION

// The below is not recommended as in the same request we are connecting receiving the HTTP request connecting to DB and
	// responding back. The concept of MVC came into picture to avoid this.
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");
		String password = request.getParameter("upassword");
		String city = request.getParameter("ucity");
		
		
		
		try {
			String url=  "jdbc:mysql://localhost:3306/jdbclearning";
			String user = "root";
			String passcode = "gkakani1";
			// Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		// Establishing connection 	
		Connection connect = DriverManager.getConnection(url,user, passcode);
		
		// Create a prepared statement object
		PreparedStatement pstmnt = connect.prepareStatement("INSERT INTO servletProject  ( name, email, password,city)" + "VALUES(?,?,?,?)");
		
		pstmnt.setString(1,name);
		pstmnt.setString(2,email);
		pstmnt.setString(3,password);
		pstmnt.setString(4,city);
		
		// To perform insert
		int rows_effected = pstmnt.executeUpdate();
		
		PrintWriter writer = response.getWriter();
		if(rows_effected != 0) {
			writer.println("<h1> Registration Success </h1>");
		}
		else {
			writer.println("<h1> Registration Failed </h1>");
		}
		pstmnt.close();
		connect.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
