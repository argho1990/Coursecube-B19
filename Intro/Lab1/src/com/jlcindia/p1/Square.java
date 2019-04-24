package com.jlcindia.p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class Square extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int k = (int)req.getAttribute("k");
		//Now it returns an object of an Object.
		//Simply type cast it.
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("The Result is"+":"+k);
		
		
	} 

}
