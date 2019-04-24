import java.io.IOException;

public class Lab687 {

    public static void main(String[] args) throws Excpetion {

        try (FileInputStream fis = new FileInputSream("D:\\D1\\abc.txt");
                BufferdInputStream bis = new BufferdInputStream(fis);) {
            while (true) {

                int asc = bis.read();
                if (asc == -1)
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
