/*
1. When SuperClass method is Instance method then you have to override in [subclass] as Instance only.
2. When SuperClass method is Static method then you have to overirde in [subclass] as Static only.
*/

class Lab382{
   public static void main(String args[]){
  // B.m1();
   B bo = new B();
   bo.m1();
   B.m2();
   
   }
}

class A{
  void m1(){
  System.out.println("I.B Super-Class");
  }
  static void m2(){
  System.out.println("S.B Sub-Class");
  }
}  
  
class B extends A{
  void m1(){
  System.out.println("I.B Super-Class");
  }
  static void m2(){
  System.out.println("S.B Sub-Class");
  }
} 





