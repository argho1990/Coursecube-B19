class Lab345 {

    public static void main(String arg[]) {

        new B();
    }
}

class A {

    A(int a) {
        System.out.println("A(int) Cons");
    }

}

class B extends A {

    B() {
        super(10);
        System.out.println("B -> D.C");
    }

}