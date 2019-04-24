package com.opps.basics;
/* Blocks:
 *
 *******************************************************************************
 * 
 * Blocks is a set of instructions defined in curly braces.
 * Block doesn't have any name so you can't invoke the block explicitly. 
 * Block will be invoked by the JVM automatically.
 * Blocks defined inside the class directly as a member are called as
 * INITIALIZATION BLOCKS:
 * 
 * There are two type of initialization blocks:
 * Instance Initialization Block(IIB)
 * Static Initialization Block(SIB)
 * *****************************************************************************
 * 
 * Instance Initialization Block:
 * Block defined inside the class directly without static modifier, 
 * is called as Instance Initialization Block.
 * IIB will be invoked by the JVM,automatically after initializing the object.
 * 
 ******************************************************************************* 
 *  Static Initialization Block:
 *  
 *  Block defined inside the class directly with static modifier is called
 *  as STATIC INTANCE BLOCKS
 *  SIB WILL BE INVOKED BY THE JVM AUTOMATICALLY after initializing the class.
 *  
 *  class Hello{
 *  int a;
 *  static int b;
 *  {
 *  System.out.println("I am IIB");
 *  }
 *  static
 *  {
 *  System.out.println("I am IIB");
 *  }
 *  }
 *  
 *  *****************************************************************************
 *  Statements cannot be directly written inside the class but can be inside 
 *  blocks.
 *  For examples: a = 10;
 *  *****************************************************************************
 *  
 *  Static variables must be intialized within static block** only but there is a
 *  chance to initialize static variables within instance block also.
 *  
 *  Static Block will be executed only once when class is loaded.
 *  Instance block will be executed everytime when object is created.
 *  => Object cannot be assigned as null,it should be provided an address using 
 *  the new operator.
 *  
 *  *****************************************************************************
 **/

	
   class Hello18{
	   
	 static int a = 10;
	 static
	  {
	  System.out.println("Static Block");
	  }
	  
	  {
	  System.out.println("Instance Block");
	  }
	 } 
     
     class Lab246{	
	 public static void main(String args[]){
	 Hello18 h = null; //Ref will be created but no Blocks will
                               //will be executed.
//           System.out.println(Hello18.a);//Static Blocks will executed and 
                                           //Static variables can be accessed 
                                           //but not Instance blocks and variables.
	System.out.println("Ref Created");
	h = new Hello18();//By producing the address and assigning it to the
                               //reference variable,blocks will be executed with 
                               //Static Block being in priority and then 
                               //Instance Blocks.
	/*<-----[Producing address, assigning it to h] ----->*/
	 
	 }
	}
