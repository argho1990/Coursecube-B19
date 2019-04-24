package com.jlc.p2;
import com.jlc.p1.Hello;

class XYZ extends Hello{}s

class Hai extends Hello{
void show(){

System.out.println("Hai -> show()");
Hello h = new Hello();
System.out.println(h.ab);

XYZ ref = new XYZ();
System.out.println(ref.ab);

}
}

class Lab371{

public static void main(String args[]){

 Hai hai = new Hello();
 hai.show();

}
}


