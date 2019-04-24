class Lab301 {

    public static void main(String args[]) {

        Hello h = new Hello();
        byte b = 20;
        System.out.println("No Casting" + ":" + h.add(b, 10)); // No Casting:
        System.out.println("Widening" + ":" + h.add(b, b));// Widening:
        // System.out.println("Narrowing" + ":" + h.add(10, 20));
        ;// Narrowing : Invalid
    }
}

class Hello {

    int add(byte a, int b) {
        System.out.println("add(byte,int)");
        return a + (int) b;

    }

}