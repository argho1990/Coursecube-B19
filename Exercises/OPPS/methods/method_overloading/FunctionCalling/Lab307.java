/*

--------------------------------------------------------------------------------------------------------------
[Call by Value]:
When you invoke a [method] by passing [primitive data] type then it is called as [Call By Value mechanism].
In the case of [call by value],modifications happened inside the [method] will not reflect to [caller method].
--------------------------------------------------------------------------------------------------------------

*/

class Lab307 {

    public static void main(String args[]) {

        int a = 99;
        Hello h = new Hello();
        System.out.println("main begin:" + a);// 99
        h.m1(a);// [99-->109]
        System.out.println("main ends:" + a);// 99
        // In the case of [call by value],[modifications] happened inside the
        // [method] will not reflect to [caller method].

    }
}

class Hello {

    void m1(int a) {

        System.out.println("m1 begin:" + a);
        a = a + 10;
        System.out.println("m1 ends" + a);

    }

}