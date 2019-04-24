class Hello {

    int show(int x) {
        System.out.println("show(()");
        // return ;
        // missing return statement.a

    }

}

class Lab286 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show(10);
        System.out.println("Hello Guys");
    }

}