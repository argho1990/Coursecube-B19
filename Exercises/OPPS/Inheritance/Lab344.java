class Lab344 {

    public static void main(String args[]) {

        new B();
    }
}

class A {
    /*
     * A() {
     * 
     * System.out.println("D.C"); }
     */
    A(int a) {
        System.out.println("A(int) Cons");
    }
}

class B extends A {

    B() {
        super();// Executes the immediate super class constructor [if defined] or else shows an
                // error.
        System.out.println("B -> D.C");
    }

}