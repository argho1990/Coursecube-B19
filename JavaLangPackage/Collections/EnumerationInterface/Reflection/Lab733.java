public class Lab733 {

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
    public String toString() {

        return eid + "\t" + name;

    }

}