class Lab392{
public static void main(String args[]){
B bobj = new B();
bobj.m1();
}
}

class A{
static void m1(){
System.out.println("A -> m1()");  
}
}

class B extends A{
static void m1(){
System.out.println("B -> m1()");
super.m1();
}
}
