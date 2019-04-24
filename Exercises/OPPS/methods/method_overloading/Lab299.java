//Order of parameters:

class Hello {

    String add(int a, String b) {
        System.out.println("add(int,string)");
        return a + b;

    }

    String add(String a, int b) {

        System.out.println("add(string,add)");
        return a + b;
    }
}

class Lab299 {
    public static void main(String args[]) {
        Hello h = new Hello();
        String a = h.add("JLC", 99);
        System.out.println(a);
        String b = h.add(99, "JLC");
        System.out.println(b);
    }

}