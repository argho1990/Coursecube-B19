/*
Var Args:
Its a newly added feature in Java 5
When you want to define a method to take multiple values of one specific type then you can use the following options.
Overload the methods.
Use array as parameters.

Ex:
class Hello{
   void sum(int a,int b){..}
   void sum(int a,int b,int c){..}
   void sum(int a,int b,int c,int d){..}
}

class Hello{
void sum(int[] arr){..}
}

The above said approaches having some complexity.To avoid the complexity VAR-ARGS concept has been introduced.

With variable arguments concept,you can define a method which can take any number of arguments of the same type.

Syntax:

<return type><methodName>(<dataType><FixedArg>,<dataType><VarArgs>)
Ex:
void sum(int values){....}
void sum(String str,int.. values){....}

To define Var-args parameter,you need to use ellipsis[(three dot(...))] after data type followed by variable name
Ex:
void sum(int...values)

Var-args parameter will be converted to an array by the Java Compiler,while generating class file,
Ex:
 void sum(int... values)---->void sum(int[] values)

When you are calling a method which contains Var-Args parameter by passing zero or more value then Java Compiler converts it
to an array.

Ex:
sum(); -->sum(new int[0]);
sum(99,88);-->sum(new int[](99,88));
sum(99,88,77);-->sum(new int[]{99,88,77});

Var Args can be used only to define parameters of method or constructor 
and cant be used.
for instance variables,static varibles,local variables.

Vars Args parameter is like an array.So data available in Var-Args parameter can be accessed like a Array.
Ex:

  void sum(int... values){

    for(int i=0;i< values.length;i++){

        System.out.println(values[i]);
    }

  }


*/
class Lab310 {

   public static void main(String[] args) {

      Hello h = new Hello();
      h.sum(12, 23);

   }

}

class Hello {

   void sum(int a, int b) {

      System.out.println("--sum(int,int)");
      System.out.println(a + b);
   }
}
