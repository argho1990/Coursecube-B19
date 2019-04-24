class Lab378{
   public static void main(String args[]){
   Hai hai = new Hai();
   hai.m1();
   
   }
}

class Hello{
  A m1(){
  return new A();
  }
 }  
  
class Hai extends Hello{
  B m1(){
  return new A();//return type cannot be same as Superclass since we are overiding.
  }
} 

class A{} 
class B extends A{}




