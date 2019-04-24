//this can be assigned to current class reference variable.

class Hi {

    void show1() {
        // Hello h1A = this; // INVALID : incompatible types: Hi cannot be converted to
        // Hello

        Hi h1B = this;
        System.out.println(h1B);
    }
}

class Hello {

    void show() {

        Hello h2A = this;
        System.out.println(h2A);
        // Hi h2B = this; // INVALID : incompatible types: Hello cannot be converted to
        // Hi

    }
}

class Lab273F {

    public static void main(String[] args) {

        Hello h3 = new Hello();
        System.out.println(h3);
        h3.show();
        Hi h4 = new Hi();
        System.out.println(h4);
        h4.show1();
    }

}