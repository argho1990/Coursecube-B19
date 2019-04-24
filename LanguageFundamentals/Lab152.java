
class Hello {
}

class Lab152 {

    public static void main(String[] args) {

        char ch = 'A';

        if (ch >= 5 && ch <= 90) {

            switch (ch) {

            case 'A':
                System.out.println(" Character is Vowel ");
                break;

            case 'E':
                System.out.println("Character is Vowel");
                break;

            case 'I':
                System.out.println("Character is Vowel");
                break;

            case 'O':
                System.out.println("Character is Vowel");
                break;

            case 'U':
                System.out.println("Character is Vowel");

            default:
                System.out.println("Character is Consonant");

            }
        }

        else {

            System.out.println("Invalid Alphabet");

        }

    }
}