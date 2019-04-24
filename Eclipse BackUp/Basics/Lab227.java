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
 * ==> Instance variables is related to instance or object of the class so when you change data of one
 *     object then that will not affect data of other objects.
 *  
 *   
 */

class Hello1{
	
	int a;
	
}

public class Lab227{
 
	public static void main(String[] args) {
	 
	  Hello1 h1  = new Hello1();
	  Hello1 h2  = new Hello1(); 
      System.out.println(h1.a + "\t" + h2.a);
      h1.a = 99;
      System.out.println(h1.a+"\t"+h2.a);
	
	}

}
