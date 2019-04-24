class Lab316 {

    public static void main(String args[]) {

        Hello h1 = new Hello();
        h1.m1();
        /*
         * 
         * reference to m1 is ambiguous h1.m1(); ^ both method m1(int...) in Hello and
         * method m1(String...) in Hello match
         * 
         */
    }
}

class Hello {

    void m1(int... a) {

        System.out.println("m1(int...)");

    }

    void m1(String... a) {

        System.out.println("m1(String...)");

    }

}