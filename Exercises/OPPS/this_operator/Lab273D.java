
class Test {
    Test() {

        System.out.println("Default Contructor");
        // Constructor calling must be the first statement.
    }

    Test(int i) {
        this();
        // this(10.19);// Constructor calling must be the first statement.
        System.out.println("Int param Constructor");
    }

    Test(double i) {
        // this(); Recursive constructor invocation is not allowed in Java.
        System.out.println("Double param Constructor");
    }
}

class Lab273A {

    public static void main(String args[]) {

        Test h = new Test();

    }
}