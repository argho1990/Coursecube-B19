package com.jlcindia.p1;

public class A{

private int a = 10;
int b = 20;
protected int c = 30;
public int d = 40;

public void showA(){

   System.out.println("A -> show()");

   System.out.println(a);//variables declared as private can be accessed from same class.
   System.out.println(b);//variables declared as default can be accessed from same class.
   System.out.println(c);//variables declared as protected can be accessed from same class.
   System.out.println(d);//variables declared as public can be accessed from same class.

}}







