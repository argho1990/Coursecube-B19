//Scope of local variables starts from its declaration statement and it goes upto 
//the end of the block where it is declared. 

class Hello {
    int a = 9;

    void show() {
        int b = 10;
        System.out.println("Instance variable :" + a); // "a" can be accessed since its an "instance variable".
        System.out.println("Local variable :" + b); // "b" can be accessed since its within the "local scope".
    }

    /*
     * void show2() { System.out.println(b);// cannot be accessed since "b" is local
     * to method show() }
     */

    /*
     * static { System.out.println(b); // cannot be accessed since "b" is local. }
     * 
     */

    /*
     * { System.out.println(b); // cannot be accessed since "b" is local. }
     * 
     */
}

class Lab273K {

    public static void main(String[] args) {

        // 1.Class loading is the process of reading the required .class file and
        // storing that information
        // in the memory.

        Hello h3 = new Hello();
        System.out.println(h3.a);
        h3.show();
        // h3.show2();
        // System.out.println(h3.b);// cannot be accessed since b is local to method
        // show();

    }

}