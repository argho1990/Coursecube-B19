/*
Private method of [Super Class] will not be visible to SubClasses.So whatever method you are writing in Subclass that will be treated 
as new method not [Overriden Method]. 
*/

class Lab383{
   public static void main(String args[]){
  // B.m1();
   new B().m1();
   
   }
}

class A{
  private void m1(){
  System.out.println("I.B Super-Class");
  }
}  
  
class B extends A{
  int m1(){
  System.out.println("SubClass Method");
  return 0;
  }
} 





