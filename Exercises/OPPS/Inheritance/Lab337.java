class Lab337 {

    public static void main(String args[]) {

        Hello h = new Hello();
    }
}

class Hai {

    {
        System.out.println("Hai [Super Class] -> I.B");
    }

    static {

        System.out.println("Hai [Super Class] -> S.B");

    }

}

class Hello extends Hai {

    {
        System.out.println("Hello [Sub Class]-> I.B");
    }

    static {

        System.out.println("Hello [Sub Class]-> S.B");

    }

}

/* Order of Execuition */
/* Static Blocks will be executed at first and then the Instance Blocks. */
/*
 * Super Class [Static Blocks] will be executed at first and then the Sub Class.
 */
/*
 * Super Class [Instance Blocks] will be executed at first and then the Sub
 * Class.
 */
