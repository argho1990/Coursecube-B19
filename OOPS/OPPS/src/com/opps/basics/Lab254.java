package com.opps.basics;
	
/*
 * Local Variables:
 * Variables can be declared at two places:
 * Inside the class directly as a member.
 * Inside the members of the Class.
 * Variables declared inside the class like methods,constructors and blocks are called as 
 * Local Variables.
 * 
 * JVM will not initialize Local Variables with default values,it must be initialized
 * by you before using.	
 */
	
   class Hello25{
	   
	  static int a;
	 
	  
	  {
	  int a = 10;
	  System.out.println("1.Block 1:"+a);
	  
	  }
	  
	  {
	
	   String a ="JLC";
	   System.out.println("2.Block 2:"+a);
	
	  }
	  //Local Blocks can have same variable names with different 
	  //data-type
	  
	 } 
     
     class Lab254{	
	 public static void main(String args[]){
	 Hello25 h = new Hello25();

	 }
	}
