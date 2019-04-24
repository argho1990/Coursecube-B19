//Method Overloading:
//You can write multiple methods inside the class with the same name by changing parameters.
//This process is called as Method Overloading.

/*
  When you are overloading methods then you must follow the following rules.
  Methods must be of same name. 
  Methods parameters must be changed in terms of 
  a. Number of parameters.
  b. Type of parameters.
  c. Order of parameters.
   
  Methods return type can be anything. 
*/

class Lab296 {

    public static void main(String args[]) {

        Hello h = new Hello();
        int a = h.add(10, 20);// storing the result in a variable with same data type.
        System.out.println(a);
        h.add(10, 20);

    }

}

class Hello {

    int add(int a, int b) {

        System.out.println("add(int,int)");
        return (a + b);

    }

    void add(int a, int b) {

        /*
         * When you are overloading methods then you must follow the following rules.
         * Methods must be of same name. Methods parameters must be changed in terms of
         * a. Number of parameters. b. Type of parameters. c. Order of parameter Methods
         * return type can be anything.
         */
        System.out.println("add(int,int)");
        return;
    }
}