import java.util.*;

public class Lab614 {

    public static void main(String[] args) {

        List list = new ArrayList();

        Iterator it = list.Iterator();
        if (it.hasNext()) {
            System.out.println(it.next());
            System.out.println("Main Completed");

        }
    }

}