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
 * 
 * LOCAL BLOCKS:
 * 
 * Block can be defined at two places:
 * Inside the class directly as a member.
 * Inside the members of a class.
 * 
 * Blocks defined inside the class members like methods,blocks,constructors,are called as LOCAL BLOCKS.
 * Local Blocks will be executed only when the enclosing class member is executed.
 * 	
 */
 
     class Lab258{	
	 public static void main(String args[]){
	 System.out.println("main():Begin");	 
	 {
		 
		 int a = 10;
		 System.out.println("I am Local Block 1 in main():"+a);
	 }	 
	 
	
     System.out.println("main():End");
	
	 
	}
}
     
     