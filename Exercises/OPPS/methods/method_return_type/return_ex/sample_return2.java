// Java program to illustrate no return 
// keyword needed inside void method 

class GFG {

    // Since return type of RR method is
    // void so this method shouldn't return any value
    void RR(int a, int b) {
        int sum = 0;
        sum = (a + b) / 10;
        System.out.println(sum);
        // no return statement in this method
    }

    public static void main(String[] args) {
        new GFG().RR(5, 5);
    }
}
