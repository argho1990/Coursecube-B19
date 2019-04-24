import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Lab677 {

    public static void main(String args) throws Exception {

        String str = "Hi,This JLC ,Java Learnin Centre";
        StringTokenizer tok = new StringTokenizer(str);
        System.out.println("Count:" + tok.countTokens());
        while (tok.hasMoreTokens()) {

            String data = tok.nextToken();
            System.out.println(data);

        }

        System.out.println("Count:" + tok.countTokens());
        System.out.println("\n \n With,Delimiter\n");

        String data = "99,Srinivas,sri@jlc.com,6579999";
        StringTokenizer tkns = new StringTokenizer(data, "");
        int id = Integer.parseInt(tkns.nextToken());
        String nm = tkns.nextToken();
        String eml = tkns.nextToken();
        long phone = Long.parseLong(tkns.nextToken());
        System.out.println("Id:" + id);
        System.out.println("Name:" + nm);
        System.out.println("Email" + emi);
        System.out.println("Phone" + phn);

    }

}