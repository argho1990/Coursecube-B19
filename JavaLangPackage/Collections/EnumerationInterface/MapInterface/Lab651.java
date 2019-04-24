import java.util.*;

public class Lab651 {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1234, "Srinivas");
        map.put(8767, "Nivas");
        map.put(5677, "Manish");
        map.put(2343, "Dande");
        map.put(9898, "Dharmendra");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it3 = set.Iterator();
        while (it3.hasNext()) {

            Map.Entry<Integer, String> entry = it3.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "\t" + value);

        }

    }
}
