

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Change the perspective to JAVA EE
/*
* THE NEED OF SERVERLET IS TO HANDLE THE HTTP REQUEST AND GENERATE DYNAMIC RESPONSES WHICH RESIDES ON WEB SERVER CONTAINER(SERVELET CONTAINER)
* 		This is not executed by JVM so this need not to be in main method
* 		Web container or Servlet container executes these servlet's
* 		Web-app or Web-Content should contain the HTML pages(index.html is by default the first page that will be executed and displayed when	
* 														// we first start the container or else we can give the specific path	)
* 		Java Resources should contain Servlet class
* 		While creating the servlet make sure to add the urlMapping from html page
* 		
*/	


@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Collecting the data from the cell within the table using name attribute specified in HTML doc
		 String uname = request.getParameter("uname");
		 String ucity = request.getParameter("ucity");
		 
		 // Give back the response to client in the Servlet itself using PrintWriter object
		 PrintWriter writer = response.getWriter();
		 writer.println("Hello :"+ uname);
		 writer.println("You are from city: " +ucity);
		 writer.close();
		 
		 // WE CAN ALSO ADD A HTML RESPONSE HERE IN THE SERVLET ITSELF USING WRITER OBJECT BUT IT IS NOT RECOMMENDED APPROCH
}

}
