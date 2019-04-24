class Hello {

    int show(int x) {
        System.out.println("show(()");
        return 12L;
        // possible lossy conversion from long to int

    }

}

class Lab287 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show(10);
        System.out.println("Hello Guys");
    }

}