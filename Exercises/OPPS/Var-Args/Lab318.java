class Lab318 {

    public static void main(String arg[]) {

        Hello h = new Hello();
        h.show(10);
    }

}

class Hello {

    void show(int... arr1) {

        System.out.println("\nshow(int...)");

    }

    /*
     * Fixed Argument method will have higher priority over Var-Args method.
     * 
     * void show(int arr1) {
     * 
     * System.out.println("\nshow(int[])"); }
     * 
     */
    void show(int[] arr1) {
        // cannot declare both show(int[]) and show(int...) in Hello
        // void show(int[] arr1) {

        System.out.println("\nshow(int[])");

    }
}
