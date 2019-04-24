import java.io.*;

public class Lab707 {

    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            Student st = new Student(99, "Shri", 65799999);
            Student.count = 9;
            System.out.println(st);
            oos.writeObject(st);
            System.out.println("Object Serialized");

        }

        catch (Excpetion e) {
            e.printTStackTrace();
        }
    }

}

class Student implements Serializable {

    int sid;
    transient String name = "XXXX";
    long phone = 333333;
    static int count = 3;

    Student(int sid, String name, long phone) {

        this.sid = sid;
        this.name = name;
        this.phone = phone;

    }

    public String toString() {

        return sid + "\t" + name + "\t" + phone + "\t" + count;

    }

}