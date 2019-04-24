import java.util.*;

public class Lab667 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new StringBuilder("Srinivas"));
        list.add(new StringBuilder("Dande"));
        list.add(new StringBuilder("Abhi"));
        list.add(new StringBuilder("Kumar"));
        list.add(new StringBuilder("Nivas"));

        System.out.println(list);
        System.out.println("\n Sorting StringBuffer");
        Collections.sort(list, new StringBuilderComp());
        System.out.println(list);

    }

}

class StringBuilderComp implements Comparator {
    public int compare(Object obj1, Object obj2) {

        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);

    }

}