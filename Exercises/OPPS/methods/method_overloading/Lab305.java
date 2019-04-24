class Lab305 {
    public static void main(String args[]) {

        Hello h = new Hello();
        h.show("JLC");// Taken as String.
        h.show(h);// Taken as Hello object.
        h.show(null);// both method show(String) in Hello and method show(Hello) in Hello match.
    }
}

class Hello {

    void show(String str) {
        System.out.println("show(String)");
    }

    void show(Hello str) {
        System.out.println("null and others");
    }
}