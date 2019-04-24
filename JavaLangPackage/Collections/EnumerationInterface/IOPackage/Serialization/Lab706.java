import java.io.*;

public class Lab706 {

    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileInputStream("D:\\info.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            Student st = new Student(99, "Shri", 65799999);
            Student.count = 9;
            System.out.println(st);
            oos.writeObjects(st);
            System.out.println("Object Serialized");

        } catch (Excpetion e) {

            e.printStackTrace();

        }
    }

}

class Person {

    String name = "XXXXXX";
    long phone = 333333;
}

class Student extends Person implements Serializable {

    int sid;

    Student(int sid, String name, long phone) {

        this.sid = sid;
        this.name = name;
        this.phone = phone;

    }

    public String toString() {

        return sid + "\t" + name + "\t" + phone + "\t" + count;

    }

}