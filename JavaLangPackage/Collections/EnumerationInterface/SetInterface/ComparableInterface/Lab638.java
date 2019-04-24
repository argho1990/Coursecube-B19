import java.util.*;

public class Lab638 {

    public static void main(String[] args) {

        TreeSet tset = new TreeSet(new StringDescComparator());
        tset.add(new Student(88, "Manish"));
        tset.add(new Student(44, "Sri"));
        tset.add(new Student(22, "Nivas"));
        tset.add(new Student(99, "Rahul"));
        tset.add(new Student(77, "Abhi"));
        Iterator it = tset.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}

class StringDescComparator implements Comparator {

    public int compare(Object ob1, Object ob2) {

        if (ob1 instanceof Student && ob2 instanceof Student) {

            Student s1 = (Student) ob1;
            Student s2 = (Student) ob2;
            return s2.compareTo(s1);

        }
        return 0;
    }

}