import java.util.*;

public class Lab664 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Srinivas");
        list.add("Dande");
        list.add("Kumar");
        list.add("Nivas");
        list.add("Nivas");

        System.out.println(list);
        System.out.println("\n REPLACING SD WITH JLC");
        Collections.replaceAll(list, "Nivas", "JLC");
        System.out.println(list);
        Object mx = Collections.max(list);
        System.out.println("\n MAX OBJ:" + mx);
        Object mn = Collections.min(list);
        System.out.println("\n MIN OBJ:" + mx);
        System.out.println("\nREPLACING ALL WITH JLC");
        Collections.fill(list, "JLC");
        System.out.println(list);

    }

}