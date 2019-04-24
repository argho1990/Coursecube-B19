//this keyword can be referred with current class name.

class Hello {
    int a = 9;

    void show() {
        System.out.println(Hello.this.a);
        // System.out.println(Hi.this.a); // error: not an enclosing class: Hi

    }
}

class Hi {

    int a = 10;

    void show1() {
        // System.out.println(Hello.this.a);// error: not an enclosing class: Hello
        System.out.println(Hi.this.a);

    }
}

class Lab273I {

    public static void main(String[] args) {

        Hello h3 = new Hello();
        h3.show();
        Hi h4 = new Hi();
        h4.show1();

    }

}