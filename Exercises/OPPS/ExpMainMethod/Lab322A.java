//Class Loading And Object Creation:

class Hello {

    int a = 99;
    static int b = 88;

    Hello() {
        System.out.println("Constructor will be invoked after I.B");
        System.out.println("Hello D.C");

    }

    void instanceMethod() {

        System.out.println("IM can access Instance Variables" + " : " + a);
        System.out.println("IM can access Static Variables" + " : " + b);
    }

    {
        System.out.println("Statement of the [contructor] will be invoked after the I.B");
        System.out.println("Instance Block can access instance variables" + " : " + a);
        System.out.println("Instance Block can access static variables" + " : " + b);
        System.out.println("Hello I.B");
    }

    static void staticMethod() {
        System.out.println("Hello S.M");
        System.out.println("Static Methods can only acccess Static Variables " + " : " + b);
        // System.out.println("Static Methods can not access Instance Variables"+":"+a);
        // cannot make a static reference to the non-static field.

    }

    static {
        System.out.println("Static Block will be invoked at first");
        System.out.println("Hello S.B");
        System.out.println("Static Blocks can only acccess Static Variables " + " : " + b);
        // System.out.println("Static Methods can not access Instance Variables"+":"+a);

    }

}

class Lab322A {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.instanceMethod();
        Hello.staticMethod();

        /*
         * Allocates [8 bytes of memory] for the [reference variables] and [initializes]
         * with [null value]. [h --> [null] -->[8 bytes]]
         * 
         * Verifies whether class is [loaded or not].
         * 
         * If not loaded then it [loads the class] by doing the [following task].
         * 
         * Reads the [byte code] from [.class file] and loads into [main memory].
         * 
         * Allocates [memory] for [static variable] and intializes with [defualt] or
         * [specified] values. [b --> 88]
         * 
         * Executes [static blocks].
         * 
         * [Constructor] will be invoked.[Statement] of the [constructor] will not be
         * executed.
         * 
         * Allocates the [memory] for [instance variables] of the [class] and
         * initializes with [defualt] or [specific values]. 99723 a-->99
         * 
         * [Instance block] will be [executed].
         * 
         * [Statements] from the [constructor] will be [executed].
         * 
         * [Address] of newly created [object] will be assigned to the [reference
         * variable].
         * 
         * c1 -----------> [99723]
         * 
         * 99723 [a-->99]
         * 
         * [8 byte] [b-->88]
         * 
         */
    }

}
