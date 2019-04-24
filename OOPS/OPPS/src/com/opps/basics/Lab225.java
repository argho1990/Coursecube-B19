package com.opps.basics;

/*    What is happening inside JVM when you create an object?
      
      Customer c1 = new Customer();------> 1
 
A.    Allocates 8 bytes of memory for the reference variable and initializes with null value.
          c1     
       ---------
      |  null   |
       ---------
        8 bytes

B.    Verifies whether class is loaded or not.If not loaded then it loads and initializes 
      the class,while loading the class,it allocates the memory for static variables and
      and initializes with default values.
      
C.    Creates an object i.e Allocates the memory for instance variables of the class
      and initializes with the default values.        
       
       99723
             
       ------------------------
         c1     cname   cphone 
       ------  -------  ------- 
          0      null    null 
       ------------------------                        
                                 
D.    Address of newly allocated object will be assigned to the reference variable.
                        
                 99723 
         c1            ---------------------------  
       ------            c1       cname    cphone
        99723  =====>  -------   --------  -------
       ------             0        null       0
        8byte          --------------------------- 
                                     
 */


class Customer{
	/*Instance variables*/
	int cid; 
	String cname;
	long cphone;
	
	/*Method*/
	void show() {
		
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(cphone);
	}
	
}

 class Lab225{
	 
	 public static void main(String args[]) {
         Customer c1 = new Customer();
		 c1.show();
		 Customer c2 = new Customer();
		 c2.cid = 99;
		 c2.cname="Shri";
		 c2.cphone=9916312687L;
		 c2.show();
}
	 
 }