import java.util.*;

public class Lab630 {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        System.out.println("--pollFirst/Last--");
        System.out.println(ts);
        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println(ts.pollLast());
        System.out.println(ts);
        System.out.println("***lower()<***");
        System.out.println(ts.lower(8));
        System.out.println(ts.lower(3));
        System.out.println("***higher()>***");
        System.out.println(ts.higher(8));
        System.out.println(ts.higher(50));
        System.out.println(ts.higher(3));
        System.out.println("***floor()<=***");
        System.out.println(ts.floor(8));
        System.out.println(ts.floor(3));

    }
}