import java.util.*;

public class Lab627 {

    public static void main(String[] args) {

        HashSet set = new LinkedHashSet();
        set.add(new Student(99));
        set.add(new Student(99));
        set.add(new Student(99));
        set.add(new Student(99));
        System.out.println(set);
    }
}

class Student {

    int sid;

    Student(int sid) {

        this.sid = sid;
    }

    public String toString() {

        return "" + sid;

    }

    public int hashCode() {

        System.out.println("** hashCode()**");
        return sid;
    }

    public boolean equals(Object obj) {
        System.out.println("** equals() **");
        if (obj instanceof Student) {

            Student st = (Student) obj;
            return this.sid == st.sid;

        }

        return false;

    }

}