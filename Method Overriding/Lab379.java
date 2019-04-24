/*
Return value should be different while [Overiding] a super class method.
*/


class Lab379{
   public static void main(String args[]){
   Hai hai = new Hai();
   hai.m1();
   }
}

class Hello{
  A m1(){
  System.out.println("Method A");
  return new A();
  }
 }  
  
class Hai extends Hello{
  B m1(){
  System.out.println("Method B");
  return new B();
  }
} 

class A{} 
class B extends A{}




