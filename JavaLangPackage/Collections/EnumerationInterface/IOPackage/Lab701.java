import java.io.*;
import java.nio.file.Files;

public class Lab701 {

    public static void main(String[] args) {
        File f = new File("d:\\hello.txt");
        f.createNewFile();
        f.deleteOnExit();
        File f2 = new File("hi.txt");
        f2.createNewFile();
        System.out.println("f2.isHidden()\t" + f2.isHidden());
        System.out.println("f2.isdelete()\t" + f2.isdelete());
        System.out.println("File Created");
        File f3 = new File("C:\\Documents and Settings\\Defualt User");
        System.out.println("f3.isHidden()\t" + f3.isHidden);

    }
}
