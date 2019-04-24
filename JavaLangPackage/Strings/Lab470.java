class Lab470 {

    public static void main(String[] args) {

        System.out.println("ABC".compareTo(ABC));
        System.out.println("ABC".compareTo("ADO"));
        System.out.println("ABC".compareTo("ABCDEFGH"));
        System.out.println(("ABCDEFGH").compareTo("ABC"));
        System.out.println(("ABC").compareTo("DEF"));
        System.out.println("ABC".compareTo("abc"));
        System.out.println("ABC".compareToIgnoreCase("abc"));
    }

}