class Lab273 {
    public static void main(String args[]) {
        Hello h = new Hello();
    }
}

class Hello {

    Hello() {

        this(10); // recursive constructor invocation
    } // cyclic constructor calling where both are calling each other.

    Hello(int a) {
        this(); // recursive constructor invocation
    }
}