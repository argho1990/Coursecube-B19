class Shape{

abstract void area(){}

}

class Square extends Shape{}

class Lab401{
public static void main(String args[]){
Shape sp = new Square();
sp.area();
}

}