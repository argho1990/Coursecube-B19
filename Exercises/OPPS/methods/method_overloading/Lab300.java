class Lab300 {

    public static void main(String args[]) {

        Hello h = new Hello();
        byte b = 20;
        System.out.println("No Casting" + " : " + h.add(10, b));// No casting.
        System.out.println("Widening" + " : " + h.add(b, b));// Widening
        // System.out.println("Narrowing" + ":" + h.add(10, 20));// Narrowing
        // possible lossy conversion from (int to byte).
        System.out.println("Type Casted[Explicitly]" + " : " + h.add(10, (byte) 20));
    }

}

class Hello {

    int add(int a, byte b) {
        System.out.println("add(int,byte)");
        return a + (int) b;// Widening

    }

}