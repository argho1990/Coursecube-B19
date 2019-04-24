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

class Lab297 {

    public static void main(String args[]) {

        Hello h = new Hello();
        int a = h.add(10, 20);
        System.out.println(a);
        int b = h.add(10, 20, 30);
        System.out.println(b);

    }

}

class Hello {

    int add(int a, int b) {

        System.out.println("add(int,int)");
        return (a + b);

    }

    int add(int a, int b, int c) {

        /*
         * When you are overloading methods then you must follow the following rules.
         * Methods must be of same name. Methods parameters must be changed in terms of
         * a. Number of parameters. b. Type of parameters. c. Order of parameter Methods
         * return type can be anything.
         */
        System.out.println("add(int,int,int)");
        return a + b + c;
    }
}