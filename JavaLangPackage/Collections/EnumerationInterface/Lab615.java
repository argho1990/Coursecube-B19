import java.util.*;

public class Lab615 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Shri");
        list.add("Nivas");
        list.add("Dande");

        Iterator it = list.Iterator();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.println(it.next());
            System.out.println("Main Completed");

        }
    }

}