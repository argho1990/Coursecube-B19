class A {

    // Since return type of RR method is double
    // so this method should return double value
    static double RR(double a, double b) {
        double sum = 0;
        sum = (a + b) / 2.0;
        // return statement below:
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(A.RR(5.5, 6.5));
        // System.out.println(new A().RR(5.5,6.5));// cannot be accessed in a static way
        // if the method is not declared non static
    }
}