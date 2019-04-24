abstract class Person{
abstract void sleeping(){}
abstract void walking(){}
}

abstract class Student extends Person{
void sleeping(){
System.out.println("Student -> sleeping()");
}
}

class CurrentStudent extends Student{
void walking(){
System.out.println("Student -> sleeping()");
}
}

class Lab405{
public static void main(String args[]){
Person p = new CurrentStudent();
p.sleeping();
p.walking();
}
}
