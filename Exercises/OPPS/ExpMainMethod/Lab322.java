class Lab322 {

    public static void main(String args) {

        System.out.println("main(String)");
    }

    /*
     * It checks whether main() method with standard signature available or not. If
     * available then laods the class first amd invokes main() method.
     */

    public static void main(String args[]) {

        System.out.println("main(String[])");
    }

    public void main(int[] args) {

        System.out.println("main(int[]");

    }

}