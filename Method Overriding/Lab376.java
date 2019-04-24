/*
[Subclass] method return type must be same as super class method [return type].
*/
class Lab376{
   public static void main(String args[]){
   B bo = new B();
   bo.show();
   }
}

class A{
  long show(){
  System.out.println("A");
  return 0;
  }
 }  
  
class B extends A{
  long show(){
  System.out.println("B");
  return 0;
  }
} 


