/*
 * Call by Reference: When you invoke a method by [passing reference data types]
 * then it is called as [Call By Reference mechanism].
 * 
 * 
 */

class Lab308 {

    public static void main(String args[]) {
        Hai hai = new Hai();
        hai.a = 99;// Property of the object changed.
        /*
         * In the case of [Call By Reference], when you modify [property of the object]
         * then [modifications] happened inside the [called method] will be [reflected]
         * to [caller method].
         */
        Hello hello = new Hello();
        System.out.println("main begin :" + hai.a);
        System.out.println("Not Modified");
        hello.m1(hai);// Caller Method:
        System.out.println("main ends :" + hai.a);
        System.err.println("Modified");
    }

}

class Hello {
    // Called Method:
    void m1(Hai hai) {
        System.out.println("m1 begin :" + hai.a);
        hai.a = hai.a + 10;

        System.out.println("m1 ends:" + hai.a);
    }
}

class Hai {

    int a;

}
