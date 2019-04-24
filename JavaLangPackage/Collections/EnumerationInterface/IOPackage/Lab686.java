import java.io.IOException;

public class Lab686 {

    public static void main(String[] args) throws Excpetion {

        System.out.println("Enter Data");
        try (BufferedInputStream bis = new BUfferedInputSream(System.in);) {

            while (true) {

                int asc = bis.read();
                if (asc == 13)
                    break;
                char ch = (char) asc;
                System.out.println(ch);

            }

        }

        catch (Excpetion e) {

            e.printStackTrace();

        }

    }

}
