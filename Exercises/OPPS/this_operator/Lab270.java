/*
this is a keyword which acts as a reference variable.
this reference variable contains address of current object.
*/
class Lab270 {
    public static void main(String args[]) {
        Student stu1 = new Student(88, "Srinivas");
        stu1.show();
        Student stu2 = new Student(99, "Dande");
        stu2.show();
    }
}

class Student {
    int sid;
    String sname;

    Student(int sid, String sname) {

        System.out.println("Student 2 Arg Constructor");
        this.sid = sid; // local variables shading the 2 Argument Constructor values.
        this.sname = sname;// you can use same name for local variables and instance variables
                           // with the help of this(operator).
    }

    void show() {
        System.out.println(sid + "\t" + sname);
    }
}
