//When you define the reference variable but not using 
//any members of the class then class will not be loaded.

class Hello {

    static {
        System.out.println("STATIC BLOCK");
    }
}

class Lab {
    public static void main(String args[]) {
        Hello h = null;
    }
}