import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Lab690 {

    public static void main(String[] args) throws Excpetion {

        try (FileInputStream fis = new FileInputSream("D:\\D1\\abc.txt");
                FileOutputStream fos = new FileOutputStream("D:\\D1\\xyz.txt");) {
            while (true) {

                int asc = fis.read();
                if (asc == -1)
                    break;
                fos.write(asc);

            }
            System.out.println("Writing Completed");

        }

        catch (Excpetion e) {

            e.printStackTrace();

        }

    }

}
