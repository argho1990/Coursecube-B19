abstract class Hello{
int a;
Hello(int a){
this.a=a;
System.out.println("Hello -> show()");
}
}

{
System.out.println("Hello -> I.B");
}

void show(){
System.out.println("Hello -> I.B");
}
}

class Hai extends Hello{
Hai(int a){
super(a);
}
}

class Lab408{
public static void main(String[] args){
Hai hai = new Hai();
hai.show();
}
}


