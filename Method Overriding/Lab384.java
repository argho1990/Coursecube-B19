/*
------------------------------------------------------------------------------
SubClass Method Access Modifier must be same or higher than Super Class Method Access Modifier:
------------------------------------------------------------------------------
Super Class    SubClass
------------------------------------------------------------------------------
public           public    
protected        protected,public     
defualt         defualt,protected,public 
private         private,defualt,protected,public      
------------------------------------------------------------------------------
*/


class Lab384{
   public static void main(String args[]){
// B.m1();
   new B().m1();
   
   }
}

class A{
  void m1(){
  System.out.println("I.B Super-Class");
  }
}  
  
class B extends A{
  private void m1(){
  System.out.println("SubClass Method");
  }
} 





