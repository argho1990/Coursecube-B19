
class Hello {
}

class Lab140 {

    public static void main(String[] args) {

        int a = 99;
        if (++a == 1) {
           System.out.println("Zero");
        }
        elseif(a++ == 2)
        System.out.println("Two");
        else 
        System.out.println("Not Matching");
        System.out.println(a); 

    }
}