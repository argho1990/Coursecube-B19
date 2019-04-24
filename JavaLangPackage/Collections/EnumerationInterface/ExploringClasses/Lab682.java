import java.util.*;

public class Lab682 {

    public static void main(String[] args) {

        String str = "Hi,this is JLC";
        Scanner sc = new Scanner();
        while (sc.hasNext()) {

            String st = sc.next();
            System.out.println(st);

        }

        sc.close();
        System.out.println("*********");
        String st2 = "Hi This is JLC. Java Training Center No 1 in Java Training ";

        Scanner sc1 = new Scanner(st2);
        while (sc1.hasNext()) {

            String st = sc1.next();
            System.out.println(st);

        }

        sc1.close();

    }

}
