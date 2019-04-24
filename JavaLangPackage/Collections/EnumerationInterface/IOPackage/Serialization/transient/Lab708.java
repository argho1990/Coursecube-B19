import java.io.*;

public class Lab708 {

    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            Address ad = new Address("33/1", "Mathikere");
            Student st = new Student(99, "Shri", 65799999, ad);
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

class Address {

    String aid;
    String street;

    Address(String aid, String street) {

        this.aid = aid;
        this.street = street;

    }

    public String toString() {

        return aid + "\t" + street;
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