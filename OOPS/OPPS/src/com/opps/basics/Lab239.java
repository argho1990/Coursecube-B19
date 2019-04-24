package com.opps.basics;
/* Blocks:
 *
 *******************************************************************************
 * 
 * Blocks is a set of instructions defined in curly braces.
 * Block doesn't have any name so you can't invoke the block explicitly. 
 * Block will be invoked by the JVM automatically.
 * Blocks defined inside the class directly as a member are called as
 * 
 * INITIALIZATION BLOCKS:
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
 *  SIB WILL BE INVOKED BY THE JVM AUTOMATICALLY after initializing the class
 *  
 *  a = 10 cannot be directly written inside the class but can be inside 
 *  methods. 
 *  
 **/

	
   class Hello11{
	   
	 int a;
	 a = 10;
	}

    class Lab239{	
	public static void main(String args[]){
	Hello11 h1 =  new Hello11();
	System.out.println(h1.a);
	

    }
}


