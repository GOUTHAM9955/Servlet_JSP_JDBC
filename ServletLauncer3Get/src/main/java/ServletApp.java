

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletApp
 */


// IF WE ARE GOING WITH GET METHOD THE DATA WILL BE VISIBLE IN THE URL BUT NOT IN POST METHOD WHERE IT WILL BE IN METHOD BODY 
	//SO IT IS ALWAYS RECOMMENDED TO GO WITH POST METHOD
public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		PrintWriter writer = response.getWriter();
		 writer.println("Hello :"+ name);
		 writer.println("You are from city: " +city);
		 writer.close();
		
	}

}
