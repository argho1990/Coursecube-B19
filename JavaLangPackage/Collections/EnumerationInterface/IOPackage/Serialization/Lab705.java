import java.io.*;

public class Lab705 {

    public static void main(String[] args) throws Exception {

        try (FileInputStream fis = new FileInputStream("D:\\info.ser");
                ObjectInputStream oos = new ObjectInputStream(fis);) {

            Object obj = ois.readObject();
            System.out.println(obj);
            System.out.println("Object Deserialized");

        } catch (Excpetion e) {

            e.printStackTrace();

        }
    }

}

class Student implements Serializable {

    int sid;
    String name;
    long phone;
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