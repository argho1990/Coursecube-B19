
public class Lab540 {

    public static void main(String[] args) {

        Hello h = Hello.getHello();
        System.out.println(h);
        System.out.println(Hello.getHello);
        System.out.println(Hello.getHello);
        Hello h2 = (Hello) h.clone();
        System.out.println(h2);

    }
}

class Hello {

    private static Hello INS = null;

    private Hello() {
    }

    public static Hello getHello() {
        return INS;

    }

    protected Object clone() {

        return this;
    }
}
