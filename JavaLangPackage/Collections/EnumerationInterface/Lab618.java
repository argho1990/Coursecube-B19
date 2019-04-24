import java.util.*;

public class Lab618 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Shri");
        list.add("Nivas");
        list.add("Java");
        list.add("JDBC");
        list.add("JSP");

        ListIterator it = list.ListIterator();
        System.out.println(list);
        while (lit.hasNext()) {

            Object obj = lit.Next();
            System.out.println(obj);
            if (obj.equals("Nivas"))
                lit.remove();
            else if (obj.equals("Java"))
                lit.set("Core Java");
            else if (obj.equals("JSP"))
                lit.add("Servlets");
        }

        System.out.println(list);

    }

}
