class Lab271 {

    public static void main(String[] args) {
        Hello h = new Hello(99, 100);
        h.show();

    }
}

class Hello {

    int a, c;
    static int b;

    int m1() {
        System.out.println("Method 1A");
        c = a + b;
        return c;
    }

    void m2() {
        System.out.println("Method 1B");

    }

    int m3() {
        System.out.println("Method 2A");
        c = a - b;
        return c;
    }

    void m4() {
        System.out.println("Method 2B");
    }

    Hello() {
        System.out.println("This is DC");
    }

    Hello(int a, int b) {
        this(); // call to contructor must be from contructors only.
        System.out.println("Hello 1 Argument");
        this.b = b; // Assigning to Class variable.
        this.a = a; // Assigning to Instance variable.
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.m1());// Using println since println takes valid return types.
        this.m2();// Without using println with void return types.
        System.out.println(this.m3());// Using println since println takes valid return types.
        this.m4();// Without using println with void return types.

    }

    // Blocks:
    {
        // this(); constructor call must be in a contructor.*/
    }

    // Methods:
    void show() {
        /* this(); //contructor call must be in a contructor. */

        System.out.printf("On incrementing a with 10 gives %d and b with 20 gives %d", a + 10, b + 20);
    }

}