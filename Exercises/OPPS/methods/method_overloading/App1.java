class Hello {

    long factorial(int n) {

        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}

class Lab230 {
    public static void main(String args[]) {

        Hello h = new Hello();
        int n = 4;
        long fact = h.factorial(n);
        System.out.println("Factorial is :" + fact);
    }

}
