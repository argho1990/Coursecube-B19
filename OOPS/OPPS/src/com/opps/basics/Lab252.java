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
	
   class Hello23{
	   
	  static int a;
	 
	 static 
	  {
	  static int b;
	  //Local variables cannot be static.Only final is allowed for local
	  //variables.
	  System.out.println(a);
	  System.out.println(b);
	  }
	  
	  
	 } 
     
     class Lab252{	
	 public static void main(String args[]){
	 System.out.println("Main:"+Hello23.a);
//	 System.out.println("Main:"+Hello23.b);
	 }
	}
