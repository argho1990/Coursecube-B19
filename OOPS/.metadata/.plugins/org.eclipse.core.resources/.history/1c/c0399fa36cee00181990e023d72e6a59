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
 *  methods both with instance and static variables so defined.
 *  Static Block is executed at first and then the Instance Block sine the loading 
 *  of the class happens before the instance members are initiated.
 *  Class can contain only five class members,we can't place any other
 *  Java Statements directly.   
 **/

	
   
class Hello11A{
  int a;
  static int b;
    {
     System.out.println("I am IIB");
    }
   static
    {
     System.out.println("I am SIB");
    }
  }

 class Lab241A{
	 
	 public static void main(String args[]){
		 
	 Hello11A h1 = new Hello11A();
	 /*
	  * Output:
	  * I am SIB
      * I am IIB
	  * 
	  */
	}
	 
}

