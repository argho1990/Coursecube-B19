
/*

When return type is void then:
a. You should not specify return statement.
b. You can specify EMPTY RETURN statement.

When [return type] is other than [void] then:
a.You must specify return statement.
b.You should not specify [EMPTY RETURN] statement.

[Return value] must be [same] or [compatibility] to the [return type].

Actual Arguments and formal arguments must be same.
-->same in terms of no of arguments.
-->same or compatibile in terms of arguments.
-->same in terms of order of parameters.

You can use Var-args as main() method paramter.
class Lab322B {

    public static void main(String... args) {

        Hello h = new Hello();
        byte b = 12;
        h.m1(b);

        // invokes m1(byte b)
        // [Sequence] : [ byte,short,long,float,double ]
    }

}

You can use the following methods for standard main() method.
public
static
final
strictfp
synchronized

You cannot use following modifiers for standard main() paramter.
abstract
native
private
protected

You can invoke main() method explicitly.


*/

class Hello {

    /*
     * void m1(byte b) { System.out.println("--byte b--"); }
     */

    /*
     * void m1(short s) { System.out.println("--short s--"); }
     */

    /*
     * void m1(int i) { System.out.println("--int i--"); }
     */

    /*
     * void m1(long a) { System.out.println("--long a--"); }
     * 
     */

    /*
     * void m1(float f) { System.out.println("--float f--"); }
     */

    void m1(double d) {
        System.out.println("--double d--");
    }

}

class Lab322B {

    public static void main(String args[]) {

        Hello h = new Hello();
        byte b = 12;
        h.m1(b);

        // invokes m1(byte b)
        // [Sequence] : [ byte,short,long,float,double ]
    }

}