/*
Type casting is a process of converting one type into another,
you can type cast both primitive and reference type in Java.

Casting is used to convert data from one data type to another data type.
By using casting,data cannot be modified but only type of data can be modified.

Type Casting:

1.Implicit/Widening/Automatic Type Casting===>Primitive/reference
2.Explicit/Narrowing/        ====>Primitive/reference

byte-->short-->int-->long-->float-->double[widening]

double-->float-->long-->int-->short-->byte[Narrowing] ==>lossy conversion

Can be made an analogy with boxes small and big[memory]
         


   

*/

public class lab_ex1 {

    public static void main(String args[]) {
        int mInt = 0;
        float mFloat = 4.125f;
        mInt = (int) mFloat;// narrowing
        System.out.println(mInt);
        mFloat = (float) mInt;// widening
        System.out.println(mFloat);
        // Implicit Type casting
        byte b = 100;
        short s = b;
        long l = s;
        int i = s;
        float f = i;
        doube d = l;
        System.out.println(b);
        System.out.println(l);
        System.out.println(f);
        // Explicit Type Casting:
        int i1 = 100;
        byte b1 = (byte) i1;
        float f1 = 250;
        b1 = (byte) f1;
        i1 = (int) f1;
        System.out.println(b1);
        System.out.println(i1);

    }
}