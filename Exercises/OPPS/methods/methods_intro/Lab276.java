class Hello {

    int a;
    static int b;

    void show() {
        System.out.println(a);// instance variables can be accessed.
        System.out.println(b);// static variables can be accessed.

    }
}

class Lab276 {

    public static void main(String args[]) {
        Hello h = new Hello(); // creating reference variable which contains object
        h.show();// can access both instance and static variables.

    }

}
