
/*
Singleton:Can have only 1 instance of a class.
Not allowed to create 2nd Instance.
If you are allowing to create only one instance that means your class is Singleton.
There should be a keyword known as Singleton which is not ****
Its a concept you can create a Singleton class.
You have to remember some steps.
 
*/

public class Singleton {

    public static void main(String args[]) {
      /* 4th step:
      Now how to get instance of a class since this method(getInstance) is a static method.
      we can simpy say it is Abc().getInstance.
      So at any condition or at any case I allow to create only.
      one instance of this class.
      Even if I write:
      Abc obj2 = new Abc();
      */  
      Abc obj1 = Abc.getInstance(); 
     // obj1 is an instance of a class.
     // Abc obj2 = new Abc();//obj2 is another instance of a class.Here the contructor is private.
     //So the only way I can instance is Abc.getInstance.
      Abc obj2 = Abc.getInstance();

    }
}

class Abc {
    /*
     * 1st step: You have to create a static instance of this class. In class only I
     * am creating instance. 2nd Step: Don't allow user to create with defualt
     * constructors. That means if I create an instance that means we are calling a
     * default contructor Abc(); which is by defualt public. What if I define a
     * constructor which is private?
     * 
     */
    static Abc obj = new Abc();
    /*Now why this object is static is because getInstance is a static method 
     and we should return an object and this object should be static*/

    // Defined a constructor which is private here.
    // which means I cannot call this Abc();
    // This is the 2nd Step:
    private Abc() {

    }

    // 3rd Step:
    /*
     * Now you should create a method which should be static which will return the
     * object of Abc(). For eg.getInstance It's not compulsory to have a method
     * getInstance. You can have any name,you can getObject. Some sensible name for
     * your method. I will say getInstance. And you will return here obj. If you
     * follow these three steps that means your allowing only one instance of your
     * class.*/
    public static Abc getInstance() {

        return obj;
    }
}