import java.util.*;

public class Lab670 {

    public static void main(String[] args) {

        int arr[] = new Int[] { 10, 43, 23, 89, 45 };

        for (int i = 0; arr.length; i++)

            System.out.println(i + "\t" + arr[i]);
        System.out.println("\n ** fill (int[],101)");
        Arrays.fill(arr, 101);
        for (int i = 0; i < arr.length; i++)
            System.out.println(i + "\t" + arr[i]);
        Object values[] = new Objects[5];
        values[0] = "Srinivas";
        values[1] = "Srinivas";
        values[2] = "Srinivas";
        values[4] = "Srinivas";
        List list = Arrays.asList(values);
        System.out.println(list);

    }

}
