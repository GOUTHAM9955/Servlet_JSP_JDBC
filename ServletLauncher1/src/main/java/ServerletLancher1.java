

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//Change the perspective to JAVA EE
/*
* THE NEED OF SERVERLET IS TO HANDLE THE HTTP REQUEST AND GENERATE DYNAMIC RESPONSES WCHICH RESIDES ON WEB SERVER CONTAINER(SERVELET CONTAINER)
* 		This is not executed by JVM so this need not to be in main method
* 		Web container or Servelet container excutes these serverlets
* 		Web-app or Web-Content should contain the HTML pages
* 		While creating the servlet make sure to add the urlMapping from html page
* 		
*/	

// LIFE CYCLE OF A SERVLET
/*
 *  A servlet class should either implement servlet interface or extend HttpServlet class
 *  	>> When the server is broutup, the servlet class is loaded
 *  	>> Then the web container creates the object of this servlet class
 *  	>> Then it will call the init method which usually contains the code related to intializing the data
 *  	>> For every requests coming from the client a thread will get created and the service method will get executed
 *  	>> When we stop the container destroy() method will get called internally 
 *  	
 */

// USING doPost METHOD(MAKE SURE TO MAKE THE METHOD AS POST IN HTML TABLE)
@WebServlet("/firstServlet")
public class ServerletLancher1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// The request captures the data coming to servlet and reponse object to send the data back to servlet
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
