class Lab326 {

    public static void main(String args[]) {

        Hello hello = new Hello();
        hello.m1();
        hello.m2();
    }
}

class Hai {

    int a = 99;

    void m1() {
        System.out.println("Hai->m1:" + a);
        // System.out.println("Hai->m2:"+b);// super class cannot access sub class
        // members.

    }

}

class Hello extends Hai {
    int b = 88;

    void m2() {
        System.out.println("Hello->m2:" + a);// subclass can access members of super class.
        System.out.println("Hello->m2:" + b);// subclass can access members of super class.

    }

}