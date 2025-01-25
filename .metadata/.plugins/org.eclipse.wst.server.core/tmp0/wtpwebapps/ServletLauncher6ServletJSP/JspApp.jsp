<%-- 
  	JSP is an extension of servlet where is has the capabilities of html and can also handle the code in a servlet.
  	The entire JSP code will be converted to servlet and get executed by Tomcat server so it is very slow 
  	
  	In real world we use servlet to handle the client requests and JSP for view pages.
  	
  		Make sure to add jsp file path in HTML action along with extension
--%>

<%-- JSP VS Servlet

	>> JSP is a HTML file which is tag based where as Servlet is Java Code
	>>Servlet is faster compared to JSP since it should be converted to Servlet and executed by web container
	>> JSP have implicit objects and we need not write create a new object
	>> If any changes made in JSP we need not re-deploy the application s
	
	 --%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Web App</title>
</head>
<body>
<h1> JSP Web APp to generate Dynamic Response </h1>

<%-- 
  	We have to use <% %> known as scriptlet tag  
  	Whatever we write in the body of scriptlet tag it will be considered as the body of the service method and we don't
  	create a service method or request, response objects.
  	In the back end, the code will be converted as a servlet and get executed.
  	To print the response back to the client, we use the out method.
  
 	 We can use <%! %> declaration tag to declare an instance variable or method.
 	 
 	 Tag to import anything we use directive tag <%@ %>
 	 
 	 We have expression tag to print anything out instead of using out object <%= %>
 	 
 	 During mapping of JSP file we have to use extension unlike for servlets
--%>

<%--
	JSP is a server-side technology that dynamically generates content for the client-side to render.
	 It does not execute any logic on the client side but can produce content that drives client-side functionality 
	
	JSP files are processed on the server before being sent to the client. The server translates JSP into a servlet (Java class), 
	which generates dynamic HTML or other content. 
--%>

<%--
Remember that we can also pass data using  session object it servlet but as a standard industry practice we 
use JSP for view pages and servlet as controller--%>

<%-- 
SERVLET VS JSP

>> Servlet is written in JAVA where as JSP is HTML tag based
>> Servlet is faster as JSP should be converted to servlet and run by web container
>> We don't need to redeploy our application if we made any changes to JSP file
--%>

<%! 
int age =25;

%>

<%@
	page import="java.util.Date"
 %>

<%
String city = request.getParameter("ucity");
String name = request.getParameter("uname");
Date date = new Date();

// The reference variable for writer object is out
out.println("Hello "+ name);
out.println("I know you are from " + city);
%>

<h1><%= date %> </h1>

</body>
</html>