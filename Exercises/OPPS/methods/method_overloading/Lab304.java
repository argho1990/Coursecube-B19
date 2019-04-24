public class Lab304 {

    public static void main(String args[]) {

        Hello h = new Hello();
        h.show(null);// Taken as String
        h.show("JLC");// Taken as String
        h.show(h);// Taken as object

    }
}

class Hello {

    void show(String str) {
        System.out.println("show(String)");

    }

    void show(Object str) {

        System.out.println("add(int,byte)");

    }

}