/*
 When we want to  develop a web application we use architecture called MVC instead of writing the application at
 	a single place
  
  M-> Model: 
  		Contains the logic responsible to connect to DataBase and does operations like fetch, store, delete ot update 
  			data in data base
  			Ex: JDBC related  code
  V-> View:
  		Anything which is visible or shown to the client is defined in view part 
  		Ex: JSP, HTML
  		
  C-> Controller: 
  		It handles the request from the client and promotes separation of Model and View.
  		Ex: Servlet 
  		
  	The flow in the working registration form:
  		1) Client interacts with controller and enters the data, when we hit register controller will interact
  			with Model and update the data
  		2) Once the data is updated the model will respond back to the controller with appropriate response
  		3) Controller upon receiving the response from model will interact with appropriate view page 
  		4) The view page will respond back to the client
 
 
 */


public class MvcIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
