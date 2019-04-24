import java.util.*;

public class Lab597 {

    public static void main(String args[]) {

        Collection col = new Collection();
        System.out.println(col);
        System.out.println("Size:" + col.size());
        System.out.println("Empty:" + col.isEmpty());
        System.out.println();
        col.add("Sri");
        col.add("Nivas");
        col.add("Srini");
        col.add("Dande");
        System.out.print(col);
        System.out.println("Size" + col.size());
        System.out.println("Empty" + col.isEmpty());

    }

}
