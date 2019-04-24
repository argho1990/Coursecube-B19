import java.util.*;

public class Lab634 {

    public static void main(String[] args) {

        System.out.println("**STUDENT INFO**");

        TreeSet ts = new TreeSet();
        ts.add(new Employee(87, "Shri"));
        ts.add(new Employee(99, "Dande"));
        ts.add(new Employee(12, "SD"));
        ts.add(new Employee(45, "Nivas"));

        Iterator it = set.Iterator();
        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }

}

class Employee implements Comparable {

    int sid;
    String sname;

    Employee(int eid, String name) {

        this.eid = eid;
        this.name = name;

    }

    public int compareTo(Object obj) {

        if (obj instanceof Employee) {

            Student st = (Employee) obj;
            return this.name.compareTo(em.name);

        }

        return 0;

    }

    public String toString() {

        return eid + "\t" + name;

    }

}
