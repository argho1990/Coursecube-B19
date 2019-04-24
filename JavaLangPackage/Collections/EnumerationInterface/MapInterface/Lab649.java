import java.util.*;

public class Lab649 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Srinivas");
        list.add("Manish");
        list.add("Dharmendra");
        list.add("Dande");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {

            String str = it.next();

            System.out.println(str);

        }

    }
}
