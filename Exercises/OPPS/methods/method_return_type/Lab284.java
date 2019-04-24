
//You are defining a method for performing an operation.After finishing the operation
//it may produce some result or may not.

/*
    Result produced from method can be used in two ways:
  1. Using the result inside the method. 
  2. Returning the result to the caller method. 
  
*/

/*
When you want to return the result to the caller of the method then you must specify return
type depending on th result.
When you dont want to return the result to the caller of the method then you must specify return type as 
void.
*/

class Hello {

    int show(int x) {
        System.out.println("I am show");
        return x;

    }

}

class Lab285 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show(10);
        System.out.println("show()");
        // the method println(boolean) in the type Print Stream is not applicable for
        // the arguments.
        // the values of the return statement inside a method cannot be printed unless a
        // [s.o.p] is used.

    }

}
