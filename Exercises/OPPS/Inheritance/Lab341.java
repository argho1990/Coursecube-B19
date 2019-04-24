// SUPER KEYWORD

/*
super is a keyword and it will be used to refer the members of immediate super class.
super keyword cannot be accessed from static context.
super keyword can be accessed in three ways

To access the immediate super class variables:
Syntax:

super<variableName>
Ex: 
  super.a  super.b

To access the immediate super class methods:

Syntax:

super<methodName>
Ex:
 super.m1();
 super.m2();


To access the immediate super class contructors.
Syntax:

super(params);

super()     -> Invokes immediate super class Contructor.
super(99)   -> Invokes immediate super class 1-Arg Constructor.
super(99,88)-> Invokes immediate super class 1-Arg Constructor. 

*/

class Lab341 {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.show();

    }

}

class Hai {

    int a = 10;

}

class Hello extends Hai {

    int a = 20;

    void show() {

        System.out.println(a); // refers to current class variable.
        System.out.println(this.a); // refers to current class variable
        System.out.println(super.a);// refer to immediate super class variable.

    }

}
