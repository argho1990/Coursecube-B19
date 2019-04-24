
//You are defining a method for performing an operation.After finishing the operation
//it may produce some result or may not.

/*
    Result produced from method can be used in two ways:
  1. Using the result inside the method. 
  2. Returning the result to the caller method. 
  
*/

/*
When you want to return the result to the caller of the method then you must specify return
type depending on the result.
When you dont want to return the result to the caller of the method then you must specify return type as 
void.
*/

class Operation {

    static int showRemainder(int a, int b) {
        if (b == 0)
            return b;
        // When return type is other than void you must specify return statement.
        // return statement cannot solely print the values unless a [s.o.p] is used.

        return a % b;

    }

}

class Lab282 {

    public static void main(String args[]) {
        System.out.println(Operation.showRemainder(10, 4));
        System.out.println("executed:1");
        System.out.println(Operation.showRemainder(10, 0));
        System.out.println("executed:2");
    }

}
