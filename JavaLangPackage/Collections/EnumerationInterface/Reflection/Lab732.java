import java.util.Date;

public class Lab732 {

    public static void main(String[] args) {

        Employee em = new Employee(99, "Shri");
        System.out.println(em);

    }

}

class Employee {

    int eid;
    String name;

    Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

   @Override
   public StringtoString(){
  
      return sid + "\t"+ name;

   }

}
