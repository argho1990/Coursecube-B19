import java.util.*;

public class Lab619 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Shri");
        list.add("Nivas");
        list.add("Java");
        list.add("JDBC");
        list.add("JSP");

        ListIterator it = list.ListIterator();
        System.out.println("Forward Order");
        while (lit.hasNext()) {
            int indx = lit.nextIndex();
            Object obj = lit.next();
            System.out.println(indx + "\t" + obj);

        }
        System.out.println("Reverse Order");
        while (lit.hasPrevious()) {
            int indx = lit.previousIndex();
            Object obj = lit.previous();
            System.out.println(indx + "\t" + obj);

        }

    }

}
