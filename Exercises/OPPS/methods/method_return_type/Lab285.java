class Hello {
    int show(int x) {

        System.out.println("show()");
        // return x;
    }

}

class Lab285 {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.show(10);
        System.out.println("Hello");
        System.out.println(new Hello().show(10));

    }
}
