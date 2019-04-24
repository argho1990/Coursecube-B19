import java.io.*;
import java.nio.file.Files;

public class Lab697 {

    public static void main(String[] args) {

        File file = new File("D:\\Hello.java");
        System.out.println("Dir Found:" + file.exists());
        file.createNewFile();
        System.out.println("Dir Found:" + file.exists());

    }
}
