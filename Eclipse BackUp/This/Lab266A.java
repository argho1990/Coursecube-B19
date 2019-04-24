/*
 * this is a keyword which acts as a reference variable.
 * this reference variable contains address of current object.
 *  
 * this keyword can be used in three ways:
 * 
 * 
 */
class Hello{
	
	int a=9;
	int b=10;
	void m1() {}
	void m2() {}
	Hello(){
		System.out.println("D.C");
	}
	Hello(int a,int b){
		System.out.println("Constructor with 2 Arg"+"\t"+this.a);
	}
	Hello(int a,int b,int c)
	{
		System.out.println("Constructor with 3 Arg"+"\t"+this.b);
	}
		
}


public class Lab266A{

	public static void main(String[] args){
    //   System.out.println(this.a);
   //	this is an instance variable reference variable and cannot
   //	be accessed from static context.
   //     C.E: 
   //     non-static variable this cannot be referenced from a static context.
   	     Hello h = new Hello();
	//  Hello h1 = new Hello(4,5);
	//  Hello h2 = new Hello(4,5,6);
	}

}