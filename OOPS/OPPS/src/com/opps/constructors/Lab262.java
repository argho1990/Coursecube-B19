package com.opps.constructors;

/* 
 * Constructors:
 * Constructors are the special methods whose name is same as class name.
 * Constructors do not have return type even void.
 * Constructors will be invoked by the JVM automatically at the time of object creation.
 * Constructors are mainly used to initialize instance variables of class with different set of values.
 *  
 */

class Student2{

	int cid;
	String cname;

	Student2(int id,String cn) {
//The Constructor without any argument is called D.C
		System.out.println("Student2 2-Arg Constructor");
		cid = id;
		cname= cn;
	}

	void show() {
		System.out.println(cid + "\t" + cname);

	}
}

public class Lab262 {

	public static void main(String[] args){
		Student2 stu1 = new Student2(88,"Rajat");
		stu1.show();
		Student2 stu2 = new Student2(99,"Srinivas");
		stu2.show();
	}

}
