import java.util.*;

public class Lab663 {

    public static void main(String[] args) {

        Set s = Collections.singelton("JLC");
        System.out.println(s);
        s.add("Hello");
        List list = Collections.singletonList("JLC");
        System.out.println(list);
        list.add("HELLO");

    }

}