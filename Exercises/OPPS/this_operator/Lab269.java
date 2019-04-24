/*
this is a keyword which acts as a reference variable.
this reference variable contains address of current object.
*/
class Lab269 {
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
        sid = sid; // local variables shading the 2 Argument Constructor values.
        sname = sname;
    }

    void show() {
        System.out.println(sid + "\t" + sname);
    }
    // When you access any variable directly then following things will happen
    /*
     * 1. Checks whether that variable is declared in the local scope or not. 2. If
     * found in the local scope,that local variable will be used. 3. If not found in
     * the local scope then check whether that variable is declared in the class
     * scope or not. 4. If found,that class level variable will be used.
     */

}
