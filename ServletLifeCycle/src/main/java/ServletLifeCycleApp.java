

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//LIFE CYCLE OF A SERVLET
/*
*  A servlet class should either implement servlet interface or extend HttpServlet class
*  	>> /When the server is brought up or started(Apache Tomcat in ou case), servlet class is loaded
*  	>> Then the web container creates the object of this servlet class
*  	>> Then it will call the init method which usually contains the code related to intializing the data
*  	>> For every requests coming from the client a thread will get created and the service method will get executed
*  	>> When we stop the container destroy() method will get called internally 
*  
*  >> LOADING, INSTATIATION, INIT and DESTROY methods are only called once but service method is called for every request
*  		//redirecting it to tyoe of method(post, get etc..)
*  	
*/

// While executing this file since it doesn't have index.html file give specific path(http://localhost:8080/ServletLifeCycle/ServletLifeCycleApp)
@WebServlet("/ServletLifeCycleApp")
public class ServletLifeCycleApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//When the server is brought up or started(Apache Tomcat in ou case), servlet class is loaded
	static
	{
		System.out.println("Servlet class is loaded");
	}
	
	//Then the web container creates the object of this servlet class
	public ServletLifeCycleApp(){
		System.out.println("Servlet Object is created");
	}
	
	// Then it will call the init method which usually contains the code related to intializing the data
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet Intialized");
	}

	//When we stop the container destroy() method will get called internally 
	public void destroy() {

	}

	// For every request the service method will be executed
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service method to handle HTTP request and to response back");
	}

}
