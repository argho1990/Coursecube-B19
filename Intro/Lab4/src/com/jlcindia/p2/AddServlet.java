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
		
		 
		   //Cookie:
		   //So whenever you send data to the server.
		   //Server will send you a response.
		   //In that response object,which is coming from the server will have a cookie.
		   //And then when you send a request to the sq servlet,we can send the cookie again
		   //So,the difference would be the cookie is coming on the client side.
		   //And again then you are sending to the server.
		   //Analogy:If you want to imagine this:
		 /*Imagine going to shop to buy something or lets say you are going to a Restuarant
		   which provides you self service,where you have to buy the product first,you have
		   to pay the amount then you will get the dish or whatever you want to eat.
		   
		   So,lets say you want to buy something that costs you around 50bucks,and you are giving 100 bucks.
		   So,you dont have a change with you,the product cost you around 50 bucks,you are paying 100 bucks.
		   The shopkeeper says he dont have a change,you dont have a change what he will do,he will say once I
		   get the change I will give it to you.
		   You go back to the seat and go back to the Cashier,and say I want my 50 bucks back,now will he 
		   remember you,after 1/2 an hour he may forgot who you are.
		   So,in the earlier scnerio what you have done is,the moment he says wait for 30 minutes,he will
		   give you a token,on that token he will write 50,which means when you go back to him after sometime.
		   you can show that token which says 50,thats a cookie.
		   When you go for the first time he will give you a token,so that when you go back to him
		   after sometime,you can use a token.
		   
		   Cookie cookie - new Cookie("k",k);
		   
		   
		   */
		 
		 
		 
		    
		     res.sendRedirect("sq"); 
		    
		    
		    
		    
		    
		    
		    
	
              
	 }

}
