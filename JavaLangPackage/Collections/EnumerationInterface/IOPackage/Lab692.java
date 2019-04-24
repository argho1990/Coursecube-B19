import java.io.*;

public class Lab692 {

    public static void main(String[] args) throws Excpetion {

        System.out.println("Enter Data");
        try (InputStreamReader isr = new InputSreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                FileWriter fw = new Filewriter("D:\\D1\\stinfo.txt", true);
                BufferedWriter bwr = new BufferedWriter(fw);) {
            char ch = 'Y';

            do {

                System.out.println("Enter Id");
                String id = br.readLine();
                String name = br.readLine();
                String info = id + "\t" + nm;
                bwr.write(info);
                bwr.newLine();
                System.out.println("Do you want to add more[Y/N]");
                ch = (char) br.readLine().charAt(0);

            } while (ch == 'y');
            bwr.close();
        }

        catch (Excpetion e) {

            e.printStackTrace();

        }

    }

}
