// Java program to illustrate usage of 
// return keyword in void method 

class K {
    // Since return type of RR method is
    // not void so this method should return a value of type as mentioned.
    static double RR(double j) {
        if (j < 9)

            // return statement below(only using
            // return statement and not returning
            // anything):
            // control exits the method if this
            // condition(i.e, j<9) is true.
            return j;
        return ++j;
    }
}
    class Lab{  
    public static void main(String[] args) {
        System.out.println(new K().RR(5.5));
        System.out.println(K.RR(5.5));

        System.out.println("In main");
    }
}
