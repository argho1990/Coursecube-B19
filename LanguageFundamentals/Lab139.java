import javax.lang.model.util.ElementScanner6;

class Hello {
}

class Lab139 {

    public static void main(String[] args) {

        int a = 99;
        if (a++ == 0) {
           System.out.println("Zero");
        }
        elseif(a++ == 1)
        System.out.println("One");
        else 
        System.out.println("Not Matching");
        System.out.println(a); 

    }
}