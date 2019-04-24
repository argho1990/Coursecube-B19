class Lab314 {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.show();// Actual and formal argument differ in length.
    }
}

class Hello {

    void show(int a, int... arr) {
        System.out.println("\nshow(int,int)");

    }

}