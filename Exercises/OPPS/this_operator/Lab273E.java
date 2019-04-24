// Use of Constructor Chaining:

class Student {

    int id;
    String name;
    String city;

    Student(int id, Strin0g name) {

        this.id = id;
        this.name = name;

    }

    Student(int id, String name, String city) {
        this(id, name);
        // this.sid = id;
        // this.name=name;
        this.city = city;
    }

    void display() {

        System.out.println(" id :" + id + " name :" + name + " city :" + city);
    }
}

class Lab273E {

    public static void main(String args[]) {

        Student s1 = new Student(1, "Srinivas", "Dehradun");
        s1.display();
        Student s2 = new Student(2, "Nivash");
        s2.display();
    }

}