/*
[Non Final method] of [super class] can be overiidden as final in [sub class].
*/

class Lab381{
   public static void main(String args[]){
   B bobj = new B();
   bobj.m1();
   }
}

class A{
  void m1(){
  System.out.println("Non final method in Super Class");
  }
 }  
  
class B extends A{
  final void m1(){
  System.out.println("Final Method in SubClass can be overidden as final");
  }
} 





