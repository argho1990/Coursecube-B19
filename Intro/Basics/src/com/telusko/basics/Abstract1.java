//Abstract Class and Abstract Methods Part 1:


package com.telusko.basics;

public class Abstract1 {

	public static void main(String[] args) {
     
		 //MaheshPhone obj = new MaheshPhone();cannot be instantiated
         //MaheshPhone obj = new RameshPhone();cannot be instantiated
		  SureshPhone obj = new SureshPhone(); 
		  //can be instantiated since it contains all the methods.
		  obj.call();
		  obj.move();
		  obj.dance();
		  obj.cook();
	}

}


abstract class MaheshPhone{ //Abstract Class
	
	public void call() {
		
		System.out.println("Calling...");
		
	}
	
abstract public void move();
abstract public void dance();
abstract public void cook();
	
}


abstract class RameshPhone extends MaheshPhone{//Abstract Class
	
	
	
 public void move(){
	 
	 System.out.println("Moving...");
	 
	 
 }
abstract public void dance();
abstract public void cook();
	
}


class SureshPhone extends RameshPhone{ //Concrete Class
	
    public void dance() {
    	
    	System.out.println("Dancing..");
    	
    }	
	
public void cook() {
    	
    	System.out.println("Cooking..");
    	
    }
	
}

