

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/* We can directly respond back to the client using PrintWriter object but it is not recommended. Servlet is a controller, it receives http requests 
		 and will decide which file to execute*/

/* We can also use HTML file or JSP file to respond back but
	In the below servlet we will respond back using JSP file as it act's as a HTML file and also 
	we can pass the data from servlet to JSP file.
	*/
public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String city = request.getParameter("ucity");
		String name = request.getParameter("uname");
		
		PrintWriter writer = response.getWriter();
		//writer.println("Hello" +name);
		//writer.println("You are from " +city);
		//writer.close();
		
		//  Sending the response to JSP file
		response.sendRedirect("/ServletLauncher3JSP/success.jsp");
		
	}
	}


