import java.util.Date;

public class Lab730 {

    public static void main(String[] args) {

        Student st = new Student("Shri");
        System.out.println(st);
        Student st1 = new Student(99, "Shri");
        System.out.println(st1);

    }

}

class Student {

    int sid;
    String name;

    Student(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }

    @Deprecated
    Student(String name) {
    }

   public StringtoString(){
  
      return sid + "\t"+ name;

   }

}
