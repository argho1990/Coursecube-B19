class Hello {

    boolean isDigit(char ch) {
        System.out.println("isDigit()" + " : " + ch);
        if (ch >= 48 && ch <= 57) // ascii num range is from(48 to 57)
            // visit: https://www.quora.com/What-is-the-ASCII-code-for-digits-or-numbers
            return true;
        return false;
    }

}

class Lab292 {

    public static void main(String args[]) {

        Hello h = new Hello();
        System.out.println(h.isDigit('A'));
        System.out.println(h.isDigit('8'));

    }

}