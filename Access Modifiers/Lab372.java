/*

IIlegal start of [Expression Error]:
[Setters] and [Getters] cannot be written iniside a [Constructor].

*/


public class Lab372{

  public static void main(String args[]){
  A aobj = new A(98);
  System.out.println(aobj.getX());
  aobj.setX(123);
  System.out.println(aobj.getX());
   
 }
}

class A{

private int x;

//Constructor:

A(int x){
this.x = x ;
System.out.println(this.x);
}

//Getter and Setters:

public void setX(int x){
this.x=x;
}

public int getX(){
return this.x;
}

}
