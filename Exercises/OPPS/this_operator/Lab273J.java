// The class will be loaded in the memory by the JVM when first time the member
// of the class will be used by JVM.

//a. When you are executing the class with java.exe then class will be loaded and static block will be executed.

class Hello {

    static {

        System.out.println("STATIC BLOCK");
    }

    // From java 7 you dont have main method then class wont be loaded and static
    // block will be executed.

    public static void main(String args[]) {

    }

}