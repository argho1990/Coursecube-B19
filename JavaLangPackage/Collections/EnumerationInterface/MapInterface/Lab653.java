import java.util.*;

public class Lab653 {

    public static void main(String[] args) {

        ArrayList<Integer> inList = new ArrayList<Integer>();
        inList.add(1234);
        inList.add(4567);
        inList.add(8910);
        showElement(inList);

        ArrayList<Float> flList = new ArrayList<Float>();
        flList.add(123.456F);
        flList.add(456.34F);
        flList.add(789.456F);
        flList.add(123.432F);
        showElement(flList);

        ArrayList<String> stList = new ArrayList<String>();

        // showElement(stList);
    }

    static void showElement(List<? extends Number> list) {

        for (Number num : list) {

            System.out.println(num + ",");

        }

        System.out.println("\n");

    }

}
