package com.jlcindia.p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class Square extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int k = Integer.parseInt(req.getParameter("k"));
		//Now it returns an object of an Object.
		//Simply type cast it.
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("The Result is"+":"+k);
		
	
		
		System.out.println("sq-called");
		
	} 

}