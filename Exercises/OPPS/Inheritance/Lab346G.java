// Java program to illustrate 
// the usage of this keyword 

class RR {
    int first = 22;
    int second = 33;

    void garcia(int a, int b) {
        a = this.first;// [Assignment] is done by the values put down by the [this] operator.
        b = this.second;// [Assignment] is done by the values put down by the [this] operator.
        System.out.println(first);
        System.out.println(second);
        System.out.println(a);
        System.out.println(b);
    }

    void louis(int m, int n) {
        this.first = m;// [Assignment] is done by the actual parameters in the [main] method.
        this.second = n;// [Assignment] is done by the actual parameters in the [main] method.
        System.out.println(first);
        System.out.println(second);
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String[] args) {
        new RR().garcia(100, 200);
        new RR().louis(1, 2);
    }
}

/*
 * When you are not writing any constructor inside the class then one default
 * constructor will be inserted by the Java Compiler.
 * 
 * When you are writing any constructor inside the class then defualt
 * constructor will not be Java compiler.
 * 
 * When you are not writing any super statement inside the constructor then
 * default super will be inserted by the Java Compiler.
 * 
 * When you are writing any super statement inside the constructor then default
 * super will not be inserted by the Java compiler.
 * 
 * => call to the [super constructor] should be the [first statement] from
 * subclass [constructor].
 * 
 * => call to this [constructor] must be first [statement] from [constructor].
 * 
 * The first statement of any constructor can be either this or super,cant be
 * both at a time.
 * 
 * Order of constructor invocation is from subclass to super class.
 * 
 * Order of constructor execution is from super class to subclass.
 *
 *
 * class A {
 * 
 * A() {
 * 
 * System.out.println("C 1");
 * 
 * } }
 * 
 * class B extends A {
 * 
 * B() {
 * 
 * System.out.println("C 2"); }
 * 
 * }
 * 
 * class Lab346G {
 * 
 * public static void main(String args[]) {
 * 
 * new B();
 * 
 * }
 * 
 * }
 * 
 * Output:
 * 
 * C 1 C 2
 * 
 * private members of super class cannot be accessed using super keyword also.
 * 
 * 
 */