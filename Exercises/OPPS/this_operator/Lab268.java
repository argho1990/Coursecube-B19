/*
this is a keyword which acts as a reference variable.
this reference variable contains address of current object.
*/
class Lab268 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show();
    }
}

class Hello {

    int a = 10;
    static int b = 20;

    void show() {
        String a = "JLC";
        String b = "SD";
        /*
         * When you have same name for local variables and class level variables then do
         * the following:
         * 
         * a. Refer the local variable directly. b. Refer the class level variable using
         * the keyword.
         * 
         */
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);// to access the variables this.<variableName>
        System.out.println("static variable accessed using (this<keyword>)" + " : " + this.b);
        // static variables can be
        // accessed using
        // this.<staticVariable>
        System.out.println("Recommendations --> should be accessed in a static way");
        System.out.println(Hello.b);

    }

}
