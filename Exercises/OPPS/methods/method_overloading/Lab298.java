//Method Overloading:
//You can write multiple methods inside the class with the same name by changing parameters.
//This process is called as Method Overloading.

/*
  
When you are overloading methods then you must follow the following rules.
  Methods must be of same name. 
  Methods parameters must be changed in terms of 
  a. Number of parameters.
==> b. Type of parameters.
  c. Order of parameters.
   
 ==> [Methods] return type can be anything. 

  */

class Lab298 {

    public static void main(String args[]) {

        Hello h = new Hello();
        int a = h.add(10, 20);
        System.out.println(a);
        String b = h.add("JLC", 99);// "Strings when concatenate with Integer with "+" operator results into a
                                    // String."
        System.out.println(b);

    }

}

class Hello {

    int add(int a, int b) {

        System.out.println("add(int,int)");
        return (a + b);

    }

    String add(String a, int b) {

        /*
         * When you are overloading methods then you must follow the following rules.
         * Methods must be of same name. Methods parameters must be changed in terms of
         * a. Number of parameters. b. Type of parameters. c. Order of parameter Methods
         * return type can be anything.
         */
        System.out.println("add(String,int)");
        return a + b;
    }
}