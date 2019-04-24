class Test {
    Test() {

        System.out.println("Default Contructor");
        this(10); // Constructor calling must be the first statement.
    }

    Test(int i) {
        this(10.19);
        System.out.println("Int param Constructor");
    }

    Test(double i) {
        // this(); recursive constructor invocatio is not allowed in Java.
        System.out.println("Double param Constructor");
    }
}

class Lab273A {

    public static void main(String args[]) {

        Test h = new Test();

    }
}