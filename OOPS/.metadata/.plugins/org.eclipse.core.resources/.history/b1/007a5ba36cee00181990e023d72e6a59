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
 *  value of the variable can be changed any number of times during program execution.
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
 *  Instance variables are also called as non-static variables.
 *  Memory will be allocated for instance variables at the time of creating an object.
 *       Instance variables is related to instance or object of the class so when you change 
 *       data of one object then that will not affect data of other objects.
 *       Instance variables must be accessed by reference variable which contains 
 *       object of the class.
 *       Following are the ways to access instance variables:
 *        a)Using reference variable that contains object reference.
 *          Hello h = new Hello();
 *          h.a = 90;
 *        b)Directly using Object Reference
 *          new Hello().a=90;//Valid 
 *          Not Recommendable because No Reusability.  
 *          
 *        c)When you try to access instance variable with null reference then 
 *          java.lang.NullPointerException will be thrown at runtime.
 *       
 *        d)When you try to access Instance variable with Class name with error message
 *          then error message will be given at compile time called
 *          "Non static variable cannot be referenced from a Static context".
 *         
 * =====> e)Cannot make a Static reference to the Non-Static field a. 
 *            
 *      > change class name to  Hello8           
 ***********************************************************************************************
 *
 *  Static Variables:
 *  
 *     Variables defined in the class using static modifier are called as static variables.
 *     Static variables are also called as Class variables.
 *     Memory will be allocated for static variables at the time of loading the class.
 *     Cases:
 *     Only one copy of memory will be allocated for static variables for multiple variables
 *     and single copy of memory will be accessed by all the object.
 *     Static variable is related to class so when you change data of static variable 
 *     then modified data will be accessed by all the classes.
 *         
 *     
 *     [change class name to Hello7]
 */

class Hello6a{
	
 static int a;	
	
}
	
    class Lab233{
	public static void main(String args[]){
	Hello6a h1 = new Hello6a();
	Hello6a h2 = new Hello6a();
	System.out.println(h1.a +"\t" + h2.a); /*Changes to Hello.a and Hello.b 
	by compiler */
	h1.a=99;
	System.out.println(h1.a+"\t"+h2.a);
    }
}


