class Hello {

    boolean isAlphabet(char ch) {
        System.out.println("isAlphabet()" + " : " + ch);
        if (ch >= 65 && ch <= 122) // ascii alphabet range is from(65 to 122)
            // visit: http://www.kerryr.net/pioneers/ascii2.htm
            return true;
        return false;
    }

}

class Lab292A {

    public static void main(String args[]) {

        Hello h = new Hello();
        System.out.println(h.isAlphabet('A'));
        System.out.println(h.isAlphabet('8'));
        
    }

}