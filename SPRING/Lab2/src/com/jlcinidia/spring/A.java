package com.jlcinidia.spring;

public class A {
private int a;
private String msg;

public A() {
	
	System.out.println("A-D.C");
}

public void setA(int a) {
	
	System.out.println("A-setA()"); // Setter Injection
	this.a = a;
}

public void setMsg(String msg) {
	
	System.out.println("A-setMsg()");//Setter Injection
	this.msg = msg;
	
}

public void showA() {
	
	System.out.println("A-showA()");
	System.out.println(a);
	System.out.println(msg);
}

}
