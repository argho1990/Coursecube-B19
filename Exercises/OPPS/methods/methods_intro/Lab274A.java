// Methods provides the functionality or operation or behaviour of an object.

/* Syntax:-
 
[modifiers] <return type> <method name> (<params>)

*/

/*

{
   Method Implementation 
}

*/

/* 
   
   Types of methods:
   Instance Methods: Methods defined inside the class without using static modifier are called as Instance methods.
   Static Methods:   Methods defined inside the class with static modifier are called as Static methods. 

*/

class Hello {

    void m1() {
        System.out.println("I.M");
    }

    static void m2() {
        System.out.println("S.M");
    }
}

class Lab274A {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.m1(); // Valid
        h.m2(); // Valid :static methods can be invoked using the reference variable which
                // contains object.
                // Recommendation: should be accessed in a static way.

        // Hello.m1(); //Invalid: cannot make a static reference to the non static
        // method m1()

        Hello.m2(); // valid: Static nethods can be invoked with class name
        Hello h1 = null;
        // h1.m1();// Invlaid:
        // Instance methods must be invoked with the reference
        // variable which
        // contains object.
        // Gives Null Pointer Exception.
        h1.m2();// Valid:Static methods can be invoked with the reference variable which
                // contains null.
    }
}