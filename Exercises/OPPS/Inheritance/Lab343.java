class Lab343 {

    public static void main(String args[]) {

        Hello.show();

    }

}

class Hai {

    static int a = 10;

}

class Hello extends Hai {

    static int a = 20;

    static void show() {

        int a = 20;
        System.out.println(a);
        // System.out.println(this.a);// [this] cannot be used inside a [Static block]
        // System.out.println(super.a);//[super] cannot be used inside a [Instance
        // block]
        System.out.println(Hello.a);// Access its own [members] or [current class]
        System.out.println(Hai.a);// Access its own [members] or here the [super class]

    }

}