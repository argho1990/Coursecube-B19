class Lab272 {
    public static void main(String args[]) {
        Hello h = new Hello();
    }
}

class Hello {

    Hello() {

        this();// C.E -----> [Recursive constructor invocation] is not allowed.
    }

}