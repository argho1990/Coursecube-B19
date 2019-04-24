interface Inter1{
class A implements Inter1{}
class B extends A{}
class C extends A{}

class Lab433{
public static void main(String args[]){
Inter1 arr[] = new B[3];
arr = new B[3];
arr[0] = new B();
arr[1] = new B();
arr[2] = new C();
for(int i =0;i<arr.length;i++)
System.out.println(arr[i]);
}
}

