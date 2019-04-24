class Hello {

    int show(int x) {
        System.out.println("show(()");
        return 0;

    }

}

class Lab291 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show(10);

        System.out.println("Hello Guys");
        System.out.println(new Hello().show(10));
        System.out.println(h.show(10));
        // to print the value of return we need to make of th reference value or by
        // creating
        // the object reference.
    }

}