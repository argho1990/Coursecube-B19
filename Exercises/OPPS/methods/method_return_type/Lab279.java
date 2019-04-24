
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

class Student {

    show(){  //CE : return type required.
    
    System.out.println("show()");
    }

}

class Lab279 {

    public static void main(String args[]) {
        Student st = new Student();
        st.show();
    }

}