//When you access the final static variables that is initialized in the same statement then JVM
//won't execute the static block. 

class Hello {

    final static int a = 90;
    static {
        System.out.println("ST BLOCK");
    }
}

class Lab {
    public static void main(String args[]) {
        System.out.println(Hello.a);
    }
}