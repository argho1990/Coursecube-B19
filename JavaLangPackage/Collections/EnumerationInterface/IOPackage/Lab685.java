import java.io.IOException;

public class Lab685 {

    public static void main(String[] args) throws Excpetion {

        JlcReader rd = new JlcReader();
        System.out.println("Enter id");
        String sid = rd.readLine();
        System.out.println("Enter Name");
        String nm = rd.readLine();
        System.out.println("Enter Phone");
        String phone = rd.readLine();
        System.out.println("Enter Fee");
        String fee = rd.readLine();
        System.out.println(sid + "\t" + nm + "\t" + phn + "\t" + fee);

    }

}

class JlcReader {

    public String readLine() throws IOExcpetion {

        StringBuffer val = new StringBuffer();
        while (true) {

            int asc = System.in.read();
            if (asc == 13)
                ;

            else if (asc == 13)
                break;
            else {

                char ch = (char) asc;

            }

        }

        return val.toString();

    }

}
