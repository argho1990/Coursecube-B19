package com.jlcindia.p2;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet{
	 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		 int i = Integer.parseInt(req.getParameter("num1"));
		 int j = Integer.parseInt(req.getParameter("num2"));
		 
		 int k = i + j;
		
		 
		
		 
		 
		 // One way to pass values from one server to server.
		 // sendRedirect() is responding to the client,hey client go to sq (theurl=12)
		 // because of the value of k is 12.
		 // Technique comes under session management.
		 // These are Session,Cookies and URL Rewriting.
		 // Changing the url and is called URL Rewriting
		 // Want to pass multiple values or pass the same value in all the servlets.
		 // Maintain the data through out the session
		 // There is a concept of session which means whenever you try to go to a web application.
	     // It will try to maintain a session for you,that will be done by your tomcat offcourse.
		 // How will you use a session here.
		 // Because is there through out your visit there(web application).
		 // If you visit one servlet,2nd servlet,3rd servlet,it will be there for you.
		 // So,what if you want to put your data into session.
		 // So,once you put your k into session here,you can use your session in the next servlet.
		 // How do we do that?
		 // Session will be given by Tomcat,we just have to get hold on it.
		 // And the way you do that is 
		 // HttpSession so HttpSession is an interface
		 // HttpSession session so as I mentioned the object will be given by Tomcat.
		 // you just have to say
		     HttpSession session = req.getSession();
		 // And once we get a session object with us,we will simply say
		     session.setAttribute("k",k);
		   //Because session will be there throughout our vist to the website right.
		   //If you go to AddServlet,if you go to Square Servlet
		   //Even after sometime you go to some other page in the same application,
		   //the same application will be available for you.
		   //After that,provided if you don't close the session,if you don't remove the value
		   // from the session "we can do that by the way".
		   //The value is going in the format of "k" and the value is k.
		   //So I am sending  a attribute which  is k and the value is k.
		    
		     res.sendRedirect("sq"); 
		    
		    
		    
		    
		    
		    
		    
	
              
	 }

}
