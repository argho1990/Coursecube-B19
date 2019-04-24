
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
        return x + 1;

    }

}

class Lab283 {

    public static void main(String args[]) {
        Hello h = new Hello();
        System.out.println("part 1");
        int a = h.show(10);// contains the return value.
        System.out.println(a);// prints the return value.
        System.out.println("part 2");
        System.out.println(h.show(10));// return statement cannot solely print the values unless a [s.o.p] is used.
        System.out.println("part 3");
        h.show(10);// prints only the method statements but not the return value since sop is not
                   // used.
        System.out.println("Good Evening");

    }

}
