import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Lab687 {

    public static void main(String[] args) throws Excpetion {

        try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr);) {

            System.out.println("Enter Id");
            String id = br.readLine();
            System.out.println("Enter Name");
            String nm = br.readLine();
            System.out.println(id + "\t" + nm);

        }

        catch (Excpetion e) {

            e.printStackTrace();

        }

    }

}
