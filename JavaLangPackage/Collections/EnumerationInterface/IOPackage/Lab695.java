import java.io.*;

public class Lab695 {

    public static void main(String[] args) {

        Files file = new File("D:\\");
        Files files[] = file.listFiles();
        for (File f : files) {

            System.out.println(f + " -> isFile:" + f.isFile() + ",isDir:" + f.isDirectory());

        }

    }
}