class Lab315 {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.show(10);
        h.show(10, 20);
        h.show(10, 20, 30);
    }
}

class Hello {

    void show(int... arr) {

        System.out.println("\nshow(int,int...)");

    }

}