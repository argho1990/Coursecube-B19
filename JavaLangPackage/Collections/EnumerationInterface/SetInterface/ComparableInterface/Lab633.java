import java.util.*;

public class Lab633 {

    public static void main(String[] args) {

        System.out.println("**STUDENT INFO**");

        TreeSet ts = new TreeSet();
        ts.add(new Student(87, "Shri"));
        ts.add(new Student(99, "Dande"));
        ts.add(new Student(12, "SD"));
        ts.add(new Student(45, "Nivas"));

        Iterator it = set.Iterator();
        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }

}

class Student implements Comparable {

    int sid;
    String sname;

    Student(int sid, String name) {

        this.sid = sid;
        this.namwe = name;

    }

    public int compareTo(Object obj) {

        if (obj instanceof Student) {

            Student st = (Student) obj;
            return this.sid - st.sid;

        }

        return 0;

    }

    public String toString() {

        return sid + "\t" + name;

    }

}
