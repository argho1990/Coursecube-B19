class Hello {
}

class Lab126 {

    public static void main(String[] args) {

        Object obj = new Hello();
        System.out.println(obj instanceof String);
        System.out.println(obj instanceof Hello);
        System.out.println(obj instanceof Object);

    }

}