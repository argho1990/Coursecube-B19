// Inheritance and Blocks:

class Lab335 {

    public static void main(String args[]) {

        new Hello();

    }

}

class Hai {

    static int a = 99;
    static {

        System.out.println("Hai -> [Super Class] S.B" + " " + a);

    }

}

class Hello extends Hai {

    static int b = 88;
    static {
        System.out.println("Hello -> [Sub Class] S.B" + " " + a);
        System.out.println("Hello -> [Sub Class] S.B" + " " + b);
    }

}

/*
 * When JVM loads the class then: It checks whether [super class] is loaded or
 * not If [super class] is not loaded then it loads the [super class] then
 * [subclass]. If [super class] is already loaded ,then it loads the [subclass]
 * directly. [Static classes] in [Super Class] will be loaded at [first] and
 * then the [Sub Class].
 */