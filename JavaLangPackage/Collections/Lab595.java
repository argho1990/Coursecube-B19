import java.util.*;

public class Lab595 {

    public static void main(String args[]) {

        Vector v = new Vector();
        v.addElement("Sri");
        v.addElement("Vas");
        v.addElement("Dande");

        System.out.print(v);
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {

            Object obj = (Object) en.nextElement();
            System.out.println(obj);

        }

    }

}
