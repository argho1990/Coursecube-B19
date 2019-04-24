/*

Java doesn't support [ Multiple inheritance ].

Java supports [Multiple Inheritance] with [Interfaces].

Java doesnt support [Hybrid Inheritance] which is using [Multiple Inheritance].

You can use extends keyword to inherit super class functionalities in subclass.

You can access super class members as well as sub class members using sub class object.

All the super class members can be accessed from sub class directly.

Sub class members cannot be accessed from super class directly.

[Object] is the [default] super class for all the [Java Class].

When a class is not extending any class then Object class becomes direct super class.
class Hello{} //Object is direct super class.

When a class is extending any super class then Object Class becomes indirect super class.
class Hai{}
class Hello extends Hai{} // Object is Indirect super class.

[Java] doesnt not support [Cyclic Inheritance].

Cyclic Inheritance involves in two cases:
a. class A extends A{}
b. class A extends B{}
c. class  B extends A{} 

[final classes] cannot be accessed.

Private members of [super class] will not be Inheritated.

When [JVM] loads the class then,
a. It checks whether super class is loaded or not.
b. If super class is not loaded then it loads super class then [subclass].
c. If super class is already loaded then it loads the [subclass] directly.

When you access [static members] of [super class] using [subclass] name then [subclass] will not be [loaded].






class Lab346B {

    public static void main(String args[]) {

        Hello h = new Hello();
        System.out.println(Hai.a);


    }

}

class Hai {

    static int a = 10;
    int b = 20;

    void show() {

        System.out.println("Super Class[Hai]" + a);
        System.out.println("Super Class[Hai]" + b);
    }

}

class Hello extends Hai {

    int c = 30;

    void show() {

        System.out.println("Sub Class" + c);

    }

}

------------------------------------------------------------------
When [JVM] creates the [object] then:

a. It allocates the [memory] of [instance variables] of [super class].
b. It allocates the [memory] of [instance variables] of [subclass].
c. It executes the [instance blocks] and [constructors] of [super class].
d. It executes the [instance blocks] and [constructors] of [sub class].

------------------------------------------------------------------

class Lab346B {

    public static void main(String args[]) {

        Hello h = new Hello();

    }
}

class Hai {

    int a = 10;

    {
        System.out.println("Hai -> I.B" + " " + a);

    }

    Hai() {
        System.out.println("Hai -> D.C");
    }
}

class Hello extends Hai {

    int b = 20;

    {
        System.out.println("Hello -> I.B" + " " + b);
    }

    Hello() {

        System.out.println("Hello -> D.C");
    }

}
--------------------------------------------------------------------------

[Constructors] of super class will be inheritated to subclass.



class Lab346B {

    public static void main(String args[]) {

        new Hello();

    }
}

class Hai {

    Hai() {
        System.out.println("Hai -> D.C");
    }
}

class Hello extends Hai {

    Hello() {

        System.out.println("Hello -> D.C");
    }

}
------------------------------------------------------------------------------------------

You can same name for super class variables,[sub class variables or local variables].

class Lab346B {

    public static void main(String args[]) {

        new Hello();

    }
}

class Hai {

    int a = 10;
    {
        System.out.println(a);
    }
}

class Hello extends Hai {

    int a = 20;
    {
        System.out.println(a);
    }
}

Checks whether that variable is declared in the local scope or not:
Order of execution:

Local Scope --> Class Scope --> Variable Inheritated[Super Class] 

When you have same name for local variables,class level variables and super class variables do the
following:

a. Refer the local variable.
b. Refer the class level variable using this keyword.
c. Refer the super class level variable using super keyword.


super keyword can be used to access both instance and static members.
*/

class Lab346B {

    public static void main(String args[]) {

        Hello h = new Hello();

    }
}

class Hai {

    int a = 10;

}

class Hello extends Hai {

    static int b = 20;

}
