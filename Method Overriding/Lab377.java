/*
If the [super class] method return type is class type then while overriding the method in [subclass] you can use 
[same class] type or its [subclass] as return type. 
*/

class Lab377{
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
  return new B();
  }
} 

class A{}
class B{}




