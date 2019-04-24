/*
this is a keyword which acts as a reference variable.
this reference variable contains address of current object.
*/
class Lab266 {

    public static void main(String args[]) {
        Hello h = new Hello();
        h.show();
    }
}

class Hello {

    int a = 10;

    void show() {
        String a = "JLC";
        System.out.println(a);
        System.out.println(a);

    }

}
