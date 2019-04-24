package com.jlcindia.p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import org.apache.catalina.connector.Request;

public class Square extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		
		 
		   
		  k = k+1;
		
	      PrintWriter out = res.getWriter();
		  out.println("The Result is"+":"+k);
		
	
		
		  System.out.println("sq-called");
		
	} 

}
