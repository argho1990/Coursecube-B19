class Lab375{
   public static void main(String args[]){
   B bo = new B();
   bo.show(99);
   bo.show("JLC");
   }
}

class A{
  void show(int ab){
  System.out.println("A-> show(int)");
  }
 }  
  
class B extends A{
  void show(String ab){
  System.out.println("B -> SHOW(String)");
  }
} 


