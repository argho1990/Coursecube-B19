Interface Inter1{
void show(){
}

class A{

public void show(){
Sytem.out.println("A -> show()");
}}

class B extends A implements Inter1{}

class Lab421{
public static void main(String args[]){
B ref = new B();
b.show();
}
}
