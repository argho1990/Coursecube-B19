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
	
   class Hello27{
	  {
	  int a = 10;
	  System.out.println("1.Block 1:"+a);
	  
	  }
	  
	  static
	  {
	   int a =20;
	   System.out.println("2.S.Block:"+a);
	
	  }
	  
	 } 
     
     class Lab256{	
	 public static void main(String args[]){
	 Hello27 h = new Hello27();
	 System.out.println("Main:"+h.a);
	 //Local variable is not a member of class so it cannot
	 //be accessed using class name or object.  
     }
	}
