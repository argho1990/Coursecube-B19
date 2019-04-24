class Lab342 {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.show();
    }
}

class Hai {

    static int a = 10;
    int b = 20;

}

class Hello extends Hai {

    static int a = 10;
    int b = 20;

    void show() {

        int a = 10;
        int b = 20;
        System.out.println("Local variable:" + a);
        System.out.println("Local variable[static]:" + b);
        System.out.println("Using this[static] :" + this.a);
        System.out.println("Using this[instance] :" + this.b);
        System.out.println("Using super[static]:" + super.a);
        System.out.println("Using super[instance]:" + super.b);
    }

}
/* [ No change in order of execution ] */
