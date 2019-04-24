package com.jlcindia.p1;

public class C {

 public void showC(){
        
     System.out.println("C -> show()");
     A a1 = new A();
     //System.out.println(a1.a);//Non [Subclass members] with [Private Modifier] cannot be accessed from [same package].
       System.out.println(a1.b);//Non [Subclass members] with [Default Modifier] can be accessed from [same package].
       System.out.println(a1.c);//Non [Subclass members] with [Protected Modifier] can be accessed [same package].
       System.out.println(a1.d);//Non [Subclass members] with [Public Modifier] can be accessed from [same package]. 
     
 }
}