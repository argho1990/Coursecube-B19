import java.util.Enumeration;

public class Lab529 {

    public static void main(String[] args) throws Excpetion {

        System.out.println("\n ** Accessing All Properties");
        Properties p = System.getProperties();
        Enumeration<E> enm = p.propertyNames();
        while (enm.hasMoreElements()) {
            String pName = enm.nextElement().toString();
            String val = System.getProperty(pName);
            System.out.println(pName + "\t:\t" + val);

        }

    }
}
