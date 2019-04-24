import java.util.*;

public class Lab652 {

    public static void main(String[] args) {

        ArrayList<String> emails = new ArrayList<String>();

        emails.add("sri@jlc.com");
        emails.add("dk@jlc.com");
        emails.add("mk@jlc.com");

        ArrayList<Long> phones = new ArrayList<String>();
        phones.add(555555L);
        phones.add(666666L);
        phones.add(777777L);

        LinkedHashMap<String, Long> refs = new LinkedHashMap<String, Long>();
        refs.add("Dande", 111111L);
        refs.add("Kumar", 222222L);
        refs.add("Ranjan", 777777L);

        Student stu = new Student(99, "Srinivas", emails, phones, refs);
        ArrayList<Student> stList = new ArrayList<Student>();
        stList.add(stu);
        stList.add(stu);
        stList.add(stu);
        stList.add(stu);

    }
}

class Student {

    int sid;
    String name;
    List<String> emails;
    List<Long> phones;
    Map<String, Long> refs;

    public Student(int sid, String name, List<String> emails, List<Long> phones, Map<String, Long> refs) {

        this.sid = sid;
        this.name = name;
        this.emails = emails;
        this.phones = phones;
        this.refs = refs;
    }

    public String toString() {

        return "\n" + sid + "\t" + name + "\n" + emails + "\n" + phones + "\n" + refs + "\n";

    }

}