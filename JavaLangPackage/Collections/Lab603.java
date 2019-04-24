import java.util.*;

public class Lab603 {

    public static void main(String args[]) {

        Collection col = new ArrayList();
        col.add("JDBC");
        col.add("JSP");
        col.add("Srinivas");
        col.add("Java");
        col.add("Dande");

        System.out.println(col + "\t" + col.size());

        Collection col2 = new ArrayList();
        col2.add("Java");
        col2.add("JDBC");
        col2.add("JSP");

        System.out.println(col2 + "\t" + col2.size());

        Collection col3 = new ArrayList();
        col3.add("Java");
        col3.add("JDBC");
        col3.add("EJB");

        System.out.println(col + "\t" + col2 + "\n" + col3);

    }

}
