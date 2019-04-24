import java.util.*;

public class Lab596 {

    public static void main(String args[]) {

        Properties p = new Properties();
        p.put("JLC-99", "Sri");
        v.put("JLC-88", "Vas");
        v.put("JLC-88", "Dande");
        System.out.print(p);
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            String pnm = (String) en.nextElement();
            String val = p.getProperty(pnm);
            System.out.println(pnm + "\t\t" + val);

        }

    }

}
