class Hello {

    boolean isDigit(char ch) {
        System.out.println("isDigit()" + " : " + ch);
        if (ch >= 65 && ch <= 122) // ascii alphabet range is from(65 to 122)
            // visit: http://www.kerryr.net/pioneers/ascii2.htm
            return true;
        return false;
    }

}

class Lab292B {

    public static void main(String args[]) {

        Hello h = new Hello();
        boolean b1 = h.isDigit('A');
        boolean b2 = h.isDigit('8');
        System.out.println(b1);// gives the boolean value as true or false.
        System.out.println(b2);// gives the boolean value as true or false.

    }

}