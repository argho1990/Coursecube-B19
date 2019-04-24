class Lab462 {

    public static void main(String[] args) {
        String st1 = "JLC";
        String st2 = "INDIA";
        final String st3 = "INDIA";
        final String st4 = "JLC";
        String st5 = st3 + st4;
        System.out.println(st1 == st2);
        System.out.println(st1 == st5);

    }

}