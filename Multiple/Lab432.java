interface Inter1{
class A implements Inter1{}
class B extends A{}
class C extends A{}

class Lab432{
public static void main(String args[]){
Inter1 arr[] = null;
arr = new B[3];
arr[0] = new A();

for(int i =0;i<arr.length;i++)
System.out.println(arr[i]);
}
}

