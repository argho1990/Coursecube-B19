package com.jlcindia.p1;

public class B extends A{

 public void showB(){
        
     System.out.println("B -> show()");
   //System.out.println(a);//SubClass members from same package cannot be accessed since its a [private modifier].
     System.out.println(b);//Defualt members can be accessed from subclasses in [same package].
     System.out.println(c);//Protected members can be accessed from subclass in [same package].
     System.out.println(d);//Public members can be accessed from subclass in [same package].
     
 }
}