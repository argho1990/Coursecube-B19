class Lab312 {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.sum(new int[0]);
        h.sum(new int[] { 12, 34, 54 });
        h.sum(new int[] { 10, 20, 50, 30 });
        h.sum(0);// Since the called method has a parameter of array type.
        h.sum(12, 34, 54);// Since the called method has a parameter of array type.
        h.sum(10, 20, 50, 30);// Since the called method has a parameter of array type.
    }
}

class Hello {

    void sum(int arr[]) {

        System.out.println("--sum(int[])");
        System.out.println("Length:" + arr.length);
        int s = 0;
        for (int a : arr) {
            s = s + a;
        }
        System.out.println("Sum is:" + s);
    }
}