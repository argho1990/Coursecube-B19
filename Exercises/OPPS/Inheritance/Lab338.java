class Lab338 {

    public static void main(String args[]) {

        new B();
    }
}

class A {
    A() {
        System.out.println("A [Super Class]-> D.C");
    }
}

class B extends A {

    B() {
        System.out.println("B [Sub Class]-> D.C");

    }
}
/*
 * At first [Super Class] constructor will be invoked and then the [Sub Class]
 */