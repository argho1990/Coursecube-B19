class Hello {

    int show(int x) {
        System.out.println("show(()");
        return true;
        // boolean cannot be converted to int
    }

}

class Lab290 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show(10);
        System.out.println("Hello Guys");
        System.out.println(new Hello().show(10));
    }

}