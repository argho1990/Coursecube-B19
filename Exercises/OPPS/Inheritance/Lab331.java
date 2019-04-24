class Lab331 {

    public static void main(String args[]) {
        System.out.println("Hello Guys");

    }

}

class Hai {
}

class Hello extends Object , Hai{}
//--> Object is the default super class for all the Java classes.
//--> class Hai{} //Object is direct super class.
//--> When a class is not extending any class then [Object Class] becomes indirect super class.
//--> class Hai{}
//--> class Hello extends Hai{}// [Object] is [indirect super class].
//--> [Object] --> [Hai] --> [Hello]
