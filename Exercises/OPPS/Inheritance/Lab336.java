class Lab336 {

    public static void main(String args[]) {

        new Hello();

    }

}

class Hai {

    int a = 99;
    {
        System.out.println("Hai --> [Super Class] I.B :" + a);
    }
}

class Hello extends Hai {

    int b = 88;
    {

        System.out.println("Hello -> [Sub Class] I.B :" + a);
        System.out.println("Hai -> [Sub Class] I.B :" + b);

    }

}

/*
 * When JVM loads the class then: It checks whether [super class] is loaded or
 * not If [super class] is not loaded then it loads the [super class] then
 * [subclass]. If [super class] is already loaded ,then it loads the [subclass]
 * directly. [Instance classes] in [Super Class] will be loaded at [first] and
 * then the [Sub Class].
 */