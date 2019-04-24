// The class will be loaded in the memory by the JVM when first time the member
// of the class will be used by JVM.

//a. When you are executing the class with java.exe then class will be loaded and static block will be executed.
//b. When you create the object of the class and before this statement no other member of the class is used then class
//   will be loaded.

class Hello {
    static int a;
    static {

        System.out.println("STATIC BLOCK");
    }
}

class Lab {
    public static void main(String args[]) {
        System.out.println(Hello.a);

    }
}