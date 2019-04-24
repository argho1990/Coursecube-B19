public class Lab446 {

    public static void main(String[] arg) {

        Student st1 = null;
        System.out.println(st1);
        st1 = new Student(99, "Shri");
        System.out.println(st1);
        String str = new String("Java Learning Centre");
        System.out.println(str);
        Integer ref = new Integer(123);
        System.out.println(ref);
    }
}

class Student {

    int sid;
    String name;

    Student(int sid, String name) {

        this.sid = sid;
        this.name = name;
    }

}