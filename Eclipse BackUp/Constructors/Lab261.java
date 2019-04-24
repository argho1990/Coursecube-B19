package c3.Contructors;

/* 
 * Constructors:
 * Constructors are the special methods whose name is same as class name.
 * Constructors do not have return type even void.
 * Constructors will be invoked by the JVM automatically at the time of object creation.
 * Constructors are mainly used to initialize instance variables of class with different set of values.
 *  
 */

class Student1 {

	int cid;
	String cname;

	Student1() {
//The Constructor without any argument is called D.C
		System.out.println("Defualt Constructor");
	}

	void show() {
		System.out.println(cid + "\t" + cname);

	}
}

public class Lab261 {

	public static void main(String[] args){
		Student1 stu1 = new Student1();
		stu1.show();
		stu1.cid = 99;
		stu1.cname = "Srinivas";
		stu1.show();
	}

}