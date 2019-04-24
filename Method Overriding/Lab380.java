/*
Final method of [super class] cannot be overiidden in [sub class].
*/


class Lab380{
   public static void main(String args[]){
   B bobj = new B();
   bobj.m1();
   }
}

class A{
  final void m1(){}
 }  
  
class B extends A{
  void m1(){}
} 





