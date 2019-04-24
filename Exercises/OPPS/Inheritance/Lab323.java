class Lab323 {

    public static void main(String args[]) {

        Hai hai = new Hai();
        System.out.println(hai.a);
     // System.out.println(hai.b);

        Hello hello = new Hello();
     // System.out.println(hello.a);
        System.out.println(hello.b);

    }

}

class Hai {

    int a = 99;// Not accessible in Hello.
}

class Hello {

    int b = 88;// Not accessible in Hai.

}