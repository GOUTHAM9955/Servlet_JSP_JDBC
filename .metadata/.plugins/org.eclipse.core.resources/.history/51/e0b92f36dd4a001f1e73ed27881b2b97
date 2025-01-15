

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		String email = request.getParameter("eamil");
		String ucity = request.getParameter("ucity");
		
		Model model = new Model();
		model.setUname(uname);
		model.setEmail(email);
		model.setPassword(password);
		model.setUcity(ucity);
		
		int row = model.register();
		
		HttpSession session = request.getSession();
		session.setAttribute("name", uname);
		if(row == 0) {
			response.sendRedirect("/MVCLauncher7/failure.jsp");
		}
		else {
			response.sendRedirect("/MVCLauncher7/success.jsp");
		}
	}

}
