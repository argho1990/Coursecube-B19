
/*

When you modify [reference] itself then [modifications] happened inside the
[called method] will not be reflected to [caller method].

*/

class Lab309 {

    public static void main(String args[]) {

        Hai hai = new Hai();
        hai.a = 99;
        Hello hello = new Hello();
        System.out.println("main begin:" + hai.a);// 99
        hello.m1(hai);
        System.out.println("main end:" + hai.a);// 99
    }
}

class Hello {

    void m1(Hai hai) {

        System.out.println("m1 begin:" + hai.a);
        hai = new Hai();// newly [generated] reference.
        hai.a = hai.a + 20;
        System.out.println("m1 end:" + hai.a);// 20
    }
}

class Hai {

    int a;
}