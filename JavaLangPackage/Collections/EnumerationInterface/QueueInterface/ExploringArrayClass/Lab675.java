import java.util.*;

public class Lab674 {

    public static void main(String[] args) {

        Calender cal = Calender.getInstance();
        Calender today = Calender.getInstance();
        cal.set(Calender.DATE, 13);
        cal.set(Calender.MONTH, 5);
        cal.set(Calender.YEAR, 2014);
        System.out.println("AFTER TODAY:" + today.after(cal));
        System.out.println("BEFORE TODAY:" + today.before(cal));
        System.out.println("compareTo:" + today.compareTo(cal));

    }

}