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
 * ********************************************************************************************** 
 *  Instance Variables:
 *  
 *  Variables defined in the class without using static modifier are called as instance variables
 *  Instance variables are also called as non-static variables
 *  Memory will be allocated for instance variables at the time of creating an object.
 *       Instance variables is related to instance or object of the class so when you change data of one
 *       object then that will not affect data of other objects.
 *     + Instance variables must be accessed by reference variable which contains object of the
 *       class.
 *       Following are the ways to access instance variables:
 *        a)Using reference variable that contains object reference.
 *          Hello h = new Hello();
 *          h.a = 90;
 *        b)Directly using Object Reference
 *          new Hello().a=90;//Valid 
 *          Not Recommendable because No Resusability.*   
 *          
 *        c)When you try to access instance variable with null reference then 
 *          java.lang.NullPointerException will be thrown at runtime.
 *       
 *   ==>  d)When you try to access Instance variable with Class name with error message
 *          then error message will be given at compile time called
 *         "Non static variable cannot be referenced from a Static context".
 *            
 *           
 ***********************************************************************************************          
 */

class Hello4{
	
	int a;
}

public class Lab230{
 
	public static void main(String[] args) {
	 
	  System.out.println(Hello4.a);
      	 
	}

}
