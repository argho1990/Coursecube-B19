class Employee {

}

public class Manager {
    public static void main(String[] args) {

        // Implicit Casting:
        /* Assigning Child Class(smaller)Type to Parent Class(larger)Type */
        Employee emp = new Manager();

        // Explicit Casting:
        /* Assigning Parent Class(smaller)Type to Child Class(larger)Type */
        // 1.Type 1:
        Manager mng = (Manager) new Employee();
        // 2.Type 2:
        Employee emp1 = new Employee();
        Manager mng1 = (Manager) emp1;

    }

}