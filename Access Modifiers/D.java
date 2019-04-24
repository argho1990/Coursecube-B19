package com.jlcindia.p2;
import com.jlcindia.p1.A;
public class D extends A{

 public void showD(){
        
      System.out.println("D -> show()");
    //System.out.println(a);// [Private Members] cannot be accessed from [Outside Package].
    //System.out.println(b);// [Default Members] can't be accessed from Sub Classes accessed from [Different Package]. 
      System.out.println(c);// [Protected Members] which are subclass can be accessed from [Different Package].
      System.out.println(d);// [Public Members] can be accessed from [Different Package]. 
     
 }
}