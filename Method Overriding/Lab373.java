/*
 Method Overriding:
[Method Overriding] is a process of implementing [super class methods] in [SubClass] with [same signature]. 
*/

class Hello{

  void m1(){
  System.out.println("Hello -> m1()");
  }
  
  void m2(){
  System.out.println("Hello -> m2()");
  }
 
}

 class Hai extends Hello{
 
 void m2(){
 System.out.println("Hello -> m1()") ;
 }
 
 void m3(){
 System.out.println("Hai -> m3()");
 }
 
 }


class Lab373{

 public static void main(String args[]){
 Hai hai = new Hai();
 hai.m1();
 hai.m2();
 hai.m3();
 
 
 
 }




}
