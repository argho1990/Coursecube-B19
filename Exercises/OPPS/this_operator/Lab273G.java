//this is a final keyword and cannot be modified.

class Hello {

    Hello() {

        this = null; // INVALID
        this = new Hello(); // INVALID

    }
}

class Lab273G {

    public static void main(String[] args) {

        Hello h = new Hello();

    }

}