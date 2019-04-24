// [this] can be used many number of times ovewriting the 
// [previous] of the [instance] and [static] variables.

// Java Program to illustrate using this 
// many number of times 

class RRR {
    // instance variable
    int a = 10;

    // static variable
    static int b = 20;

    void GFG() {
        // referring current class(i.e, class RR)
        // instance variable(i.e, a)
        this.a = 100;

        System.out.println(a);

        // referring current class(i.e, class RR)
        // static variable(i.e, b)
        this.b = 600;

        System.out.println(b);

        // referring current class(i.e, class RR)
        // instance variable(i.e, a) again
        this.a = 9000;

        System.out.println(a);

        this.b = 2000;
        System.out.println(b);
    }

    public static void main(String[] args) {
        new RRR().GFG();
    }
}
