import java.io.*;
import java.nio.file.Files;

public class Lab702 {

    public static void main(String[] args) {
        File f1 = new File("shri");
        File f2 = new File(f1, "jlc\\io");
        f2.mkdirs();
        System.out.println("directory to inside jlc,and jlc inside sri is created");
        File f3 = new File(f2, "hai.txt");
        System.out.println("f3.getName()\t" + f3.getName());
        f3.createNewFile();
        System.out.println("file hi.txt is created sri\\jlc\\io");
    }
}
