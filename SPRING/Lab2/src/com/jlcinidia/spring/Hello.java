package com.jlcinidia.spring;

public class Hello {

	private A aobj;
	private B bobj;
	
	public void setAobj(A aobj) {
		
		System.out.println("Hello-setAobj");
		this.aobj = aobj;
	}
	
	public Hello(B bobj) {
		this.bobj = bobj;
		
	}
    
	public void show() {
		
		System.out.println("show in Hello");
		aobj.showA();
		bobj.showB();
	}
	
}
