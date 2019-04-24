interface Inter1{

int AB =90;
}

class Hello{
String AB ="JLC";
}

class Hai extends Hello implements Inter1{
void show(){

System.out.println(super.AB);
System.out.println(Inter1.AB);
}
}



}