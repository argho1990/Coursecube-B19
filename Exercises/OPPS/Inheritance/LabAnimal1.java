class Animal {

    String name = "Dog";

    void jump(String name) {
        System.out.println("Can jump higher" + name);
    }

}

class A1 {

    public static void main(String args[]) {

        Animal a1 = new Animal();
        System.out.println(a1.hashCode());
        System.out.println(a1.name.hashCode());

    }

}