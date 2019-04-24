class Hello {

    // smaller to bigger.

    long show(int x) {
        System.out.println("show(()");
        return 'A';
    }
}

class Lab288 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show(10);
        System.out.println("Hello Guys");
        System.out.println(new Hello().show(10));
    }

}