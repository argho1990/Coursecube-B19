class Hello {

    static void show() {
        System.out.println("Static show()");

    }
}

class Lab275A {

    public static void main(String args[]) {
        Hello h = null; // reference variable contains null.
        h.show();// static methods can be invoked with the same above.
        h = new Hello(); // creating reference variable which contains object.
        h.show(); // static methods can be invoked with the same above
        Hello.show(); // static methods can be invoked with class name.

    }

}
