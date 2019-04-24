class Hello {

    void show() {
        System.out.println("Instance show()");

    }
}

class Lab274B {

    public static void main(String args[]) {
        Hello h = null; // reference variable contains null.
        // h.show();NPE
        h = new Hello();// creating reference variable which contains object.
        h.show();
        // Hello.show();non static method show cannot be referenced from a static.
        // context.
    }

}
