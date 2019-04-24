abstract class Shape{
abstract void sleeping(){}
}

abstract class Student extends Person{
void sleeping(){
System.out.println("Student -> sleeping()");
}
}

class CurrentStudent extends Student{}
class Lab406{
public static void main(String args[]){
Person p = new CurrentStudent();
p.sleeping();
}
}
