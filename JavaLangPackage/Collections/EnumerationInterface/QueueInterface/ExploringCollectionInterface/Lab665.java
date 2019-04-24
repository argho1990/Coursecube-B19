import java.util.*;

public class Lab665 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Srinivas");
        list.add("Dande");
        list.add("Kumar");
        list.add("Nivas");
        list.add("Nivas");

        System.out.println(list);
        System.out.println("\n REVERSE");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("\n ROTATE(2)");
        Collections.rotate(list, 2);
        System.out.println(list);
        System.out.println("\n ROTATE(-3)");
        Collections.rotate(list, -3);
        System.out.println(list);

        System.out.println("\n SHUFFLE");
        for (int i = 0; i < 5; i++) {

            Collections.shuffle(list);
            System.out.println(list);

        }

    }

}