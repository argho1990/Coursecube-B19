// Java program to illustrate usage 
// of return keyword 

class A {

    // Since return type of RR method is double
    // so this method should return double value
    double RR(double a, double b) {
        double sum = 0;
        sum = (a + b) / 2.0;
        // return statement below:
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new A().RR(5.5, 6.5));
        // since the method is declared non-static it can be accessed by the creating
        // the object reference.
    }
}
