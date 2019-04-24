package com.opps.basics;
/*  Members of the Class:
 *
 * 
 * ******************************************************************************
 * 
 *  Following members can be defined in a Class:
 *  Variables
 *  Blocks
 *  Constructors
 *  Methods
 *  Inner Class
 *  
 * ********************************************************************************
 * 
 *  Variables:
 *  container which holds the data
 *  memory allocated for the variable for the variable while executing the program.
 *  value of the variable changed any number of times during program execution.
 *  
 *  Types of Variable:
 * 
 *  Data Type:
 *  
 *  1.Primitive Variables
 *  2.Reference Variables
 *  
 *  Types of Variables:
 * 
 *   Declared inside the class
 *   1.Instance 
 *   2.Static 
 *   
 *   
 *********************************************************************************   
 *   class Hello{
 *   
 *   int a ;          Primitive Instance Variables
 *   String str;      Reference Instance Variables
 *   static int a;    Primitive Static Variables
 *   static String msg; Reference Static Variables
 *   
 *   }
 *  
 *  Instance Variables:
 *  
 *  Variables defined in the class without using static modifier are called as instance variables
 *  Instance variables are also called as non-static variables
 *  Memory will be allocated for instance variables at the time of creating an object.
 *  
 *   
 *   
 */



class Hello{
	
	int a;
	
}

public class Lab226{
 
	public static void main(String[] args) {
	 
	  Hello h  = new Hello(); 
      System.out.println(h.a);
      h.a = 99;
      System.out.println(h.a);
	
	}

}
