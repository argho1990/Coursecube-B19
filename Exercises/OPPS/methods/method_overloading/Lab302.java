public class Lab302 {

  public static void main(String args[]) {

    Hello h = new Hello();
    byte b = 20;
    h.add(b, 10);
    h.add(10, b);
    h.add(b, b);// [Ambiguity Error] / [reference to add is ambiguous]
  }
}

class Hello {

  void add(byte a, int b) {

    System.out.println("add(byte,int)");

  }

  void add(int a, byte b) {

    System.out.println("add(int,byte)");

  }

}