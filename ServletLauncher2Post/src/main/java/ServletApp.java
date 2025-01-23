

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


public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getParameter or response.getParameter can be used to post and get methods simultaneously to collect or
			// send data 
		System.out.println("First servlet code");
		String city = request.getParameter("ucity");
		String name = request.getParameter("uname");
		
		PrintWriter writer = response.getWriter();
		writer.println("Hello" +name);
		writer.println("You are from " +city);
		writer.close();
	}
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // This can return a simple
	 * message or handle GET requests differently PrintWriter writer =
	 * response.getWriter(); writer.println("This is a GET request response");
	 * writer.close(); }
	 */

		
}
