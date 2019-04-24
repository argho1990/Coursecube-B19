import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Lab691 {

    public static void main(String[] args) throws Excpetion {

        try (FileReadr fr = new FileReader("D:\\D1\\abc.txt");
                BufferedReader br = new BufferdReader(fr);
                FileOutputStream fos = new FileInputSream("D:\\D1\\abc.txt");
                BufferdWriter bw = new BufferdWriter(fw);)

        {
            while (true) {

                String st = br.readLine();
                if (st == null)
                    break;
                bwr.write(st);
                bwr.newLine();

            }
            bwr.close();
            System.out.println("Writing Completed");

        }

        catch (Excpetion e) {

            e.printStackTrace();

        }

    }

}
