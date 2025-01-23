

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


/* Usually controller handles the request and passes it to the servlet. There can be multiple servlets in an application and 
 	 for every servlet we will be having request object and a response object. */

/* Let us implement a scenario where the request comes to a user to FirstServlet and it passes the response object to SecondServlet which responds back
	 to the client.
	 There are two approaches to do it
		 1) Using forward() method (Using forward method we directly forward the response to the servlet specified in RequestDispatcher)
		 2) Using include() method (Using include the response from 1st servlet is forwarded to 2nd servlet and it will again come back to 1st servlet 
				 include it's response and respond back to client )*/

// To maintain the data through out the web application and pass it from one servlet to other we have the concept of session 


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		/* To pass the data to another servlet along with dispatching to other servlets we use session object.
		     We can use the same session object by passing false as attribute to getsession(false){refer Second Servlet}
		      method to pass variables to other servlets */
		 HttpSession session =request.getSession();
		 session.setAttribute("name", name);
		 session.setAttribute("city", city);
		 
		 //Setting max interval time the data is stored in the session as 30sec
		 session.setMaxInactiveInterval(1000);
		
		// Redirecting the request using Dispatcher
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("/SecondServlet");
		
		System.out.println("Control in 1st servlet");
		
		
		
		
		//Using forward method we directly forward the response to the servlet specified in RequestDispatcher
		//reqDispatcher.forward(request, response);
		
		// Using include the response will be given by 2nd servlet including the response from 1st servlet to the client 
		reqDispatcher.include(request, response);
		
		//Let's check if the below response is considered (No)
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response form 1st Servlet Only</h1>");
		writer.close();
		

	}

}
