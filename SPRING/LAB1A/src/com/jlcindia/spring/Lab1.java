package com.jlcindia.spring;

public class Lab1 {


		
	    // Without IOC
		 public static void main(String[] args) {
		  System.out.println("1st Part Begin");	 
	      A aobj = new A();
	      System.out.println("1st part End");
	      
	      System.out.println("2nd part Begin");
	      aobj.setA(99);
	      aobj.setMsg("HelloGuys");
	      System.out.println("2nd Part End");
	      
	      System.out.println("3rd part Begin");
	      B bobj = new B(88,"Hai Guys");
	      System.out.println("3rd Part End");
	      
	      System.out.println("4th part Begin");
	      Hello hello = new Hello(bobj);
	      System.out.println("4th part End");
	      
	      System.out.println("5th part Begin");
	      hello.setAobj(aobj);
	      System.out.println("5th part End");
	      
	      System.out.println("6th part Begin");
	      hello.show();
	      System.out.println("6th part End");
	   }
	         
	}  

	
		
		
		
	    
	    
		
	    
	     
	 
	   
		

