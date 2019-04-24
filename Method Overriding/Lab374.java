
class Lab374{
   public static void main(String args[]){
   B bo = new B();
   bo.show();
   bo.SHOW();
   }
}

class A{
  void show(){
  System.out.println("A -> show()");
  }
 }  
  
class B extends A{
  void SHOW(){
  System.out.println("B -> SHOW()");
  }
} 


