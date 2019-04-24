package com.opps.THIS;

/*
 * this is a keyword which acts as a reference variable.
 * this reference variable contains address of current object.
 *  
 * this keyword can be used in three ways:
 * To access the instance variables:
 * this.a
 * To access the methods:
 * this.m1();
 * To access the overloaded constructor
 * this(parameters);
 * 
 */
class Hello{
	
	int a=9;
	int b=10;
	void m1(){
		System.out.println("Methods 1");
	}
	
	void m2(){System.out.println("Methods 2");}
	Hello(){
		System.out.println("D.C");
		this.m1();
	}
	
	Hello(int a,int b){
		System.out.println("Constructor with 2 Arg"+"\t"+(this.a+a));
		System.out.println("Constructor with 2 Arg"+"\t"+(this.b+b));
		this.m1();
		this.m2();
	}
	
	Hello(int a,int b,int c)
	{   this();
        //this(10,20);
	    //Constructor call must be the first statement in a 
	    //Constructor. 
		System.out.println("Constructor with 3 Arg"+"\t"+this.b);
	}
		

}


public class Lab266A{

	public static void main(String[] args){
    //  System.out.println(this.a);
   //	this is an instance variable reference variable and cannot
   //	be accessed from static context.
   //   C.E: 
   //   non-static variable this cannot be referenced from a static context.
   	//  Hello h = new Hello();
	    Hello h1 = new Hello(4,5);
	    Hello h2 = new Hello(4,5,6);
	}

}