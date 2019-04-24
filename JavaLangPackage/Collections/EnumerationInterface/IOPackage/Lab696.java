import java.io.*;

public class Lab696 {

    public static void main(String[] args) {

        Files file = new File("D:\\D1");
        Files javaFiles[] = file.listFiles(new ExtFilter(".java"));
        System.out.println("*JAVA FILES**");
        if (javaFiles != null)
            for (File f : javaFiles)
                System.out.println(f);
        else
            System.out.println("No java file found");

    }
}

class ExtFilter implements FileFilter {

    String ext;

    public ExtFilter(String ext) {

        this.ext = ext;

    }

    public boolean accept(File f) {

        return f.getName().endsWith(ext);

    }

}