import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Lab689 {

    public static void main(String[] args) throws Excpetion {

        try (FileInputStream fis = new FileInputSream("D:\\D1\\abc.txt");
                BufferdInputStream bis = new BufferdInputStream(fis);) {
            while (true) {

                String id = br.readLine();
                if (id == null)
                    break;
                System.out.println(id);

            }

        }

        catch (Excpetion e) {

            e.printStackTrace();

        }

    }

}
