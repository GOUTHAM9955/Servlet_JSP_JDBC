

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Control in 2nd servlet");
		
		//To keep the existing session we mention it as false
		HttpSession session = request.getSession(false);
		
		// This gives it as an object so make sure to typcast
		String name = (String) session.getAttribute("name");
		String city = (String) session.getAttribute("city");
		//Let's check if the below response is considered
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Response form 2nd Servlet: </h1>"+ "<h1>" +name+ "</h1>" +  "<h1> You mentioned your city as </h1>" + "<h1>" + city+ "</h1>");
		writer.close();
	}

}
