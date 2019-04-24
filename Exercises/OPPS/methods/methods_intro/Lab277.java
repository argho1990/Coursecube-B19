class Hello {

    int a;
    static int b;

    static void show() {
        // System.out.println(a);// instance variables cannot be accessed.
        System.out.println(b);// static variables can be accessed.

    }
}

class Lab277 {

    public static void main(String args[]) {
        Hello.show(); // creating reference variable which contains object

    }

}
