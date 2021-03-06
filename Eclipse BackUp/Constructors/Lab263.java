package c3.Contructors;

/* 
 * Constructors:
 * Constructors are the special methods whose name is same as class name.
 * Constructors do not have return type even void.
 * Constructors will be invoked by the JVM automatically at the time of object creation.
 * Constructors are mainly used to initialize instance variables of class with different set of values.
 * You can write multiple constructors inside the class by changing parameters.
 * This process is called  Constructor Overloading.
 * When you are overloading Constructors 
 */

class Student3 {

	int cid;
	String cname;
	String email;
	long phone;

	Student3(int id, String cn, String em, long ph) {
		System.out.println("Student3 4-Arg Constructor");
		cid = id;
		cname = cn;
		email = em;
		phone = ph;
	}

	Student3(int id, String cn, String em) {
		System.out.println("Student3 3-Arg Constructor");
		cid = id;
		cname = cn;
		email = em;
	}

	Student3(int id, String cn) {
		System.out.println("Student3 2-Arg Constructor");
		cid = id;
		cname = cn;
	}

	Student3(int id) {
		System.out.println("Student3 1-Arg Constructor");
		cid = id;
	}
    Student3(){
        System.out.println("Default Constructor");
    }
	void show() {
		System.out.println(cid + "\t" + cname + "\t" + email + "\t" + phone);

	}
}

public class Lab263 {

	public static void main(String[] args) {
		Student3 stu1 = new Student3(88, "Rajat", "ticklu1990@gmail.com", 9916312687L);
		stu1.show();
		Student3 stu2 = new Student3(99, "Srinivas", "vas@jlc.com");
		stu2.show();
		Student3 stu3 = new Student3(99, "Srinivas");
		stu3.show();
        Student3 stu4 = new Student3(99);
		stu4.show();
		Student3 stu5 = new Student3();
		stu5.show();
	}

}
