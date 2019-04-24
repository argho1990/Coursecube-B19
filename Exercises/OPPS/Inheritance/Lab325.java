class Lab325 {

   public static void main(String args[]) {

      Hai hai = new Hai();
      System.out.println(hai.a);
      System.out.println("HashCode" + "  " + hai.hashCode());
      // System.out.println(hai.b);//Super class cannot access members of sub class.
      Hello hello = new Hello();
      // System.out.println(hello.a);// Sub class can access members of super class.
      // System.out.println(hello.b);// Sub class can access member of super class.
      System.out.println("HashCode" + "  " + hello.hashCode());

   }
}

class Hai {

   int a = 99;
}

class Hello extends Hai {

   int b = 88;

}