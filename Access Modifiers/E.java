package com.jlcindia.p2;
import com.jlcindia.p1.A;

public class E{
public void showE(){
      System.out.println("E-> show()");
      A a1 = new A();
    //System.out.println(a1.a);
    //[Private members] can't be accessed from [Non Subclasses] outside different [Package].
    //System.out.println(a1.b);
    //[Default members] can't be accessed from [Non Subclasses] outside different [Package].
    //System.out.println(a1.c);
    //[Protected members] can't be accessed from [Non Subclasses] outside different [Package].
      System.out.println(a1.d);
    //[Public members] can be accessed from [Non Subclasses] outside different [Package].
 }
}