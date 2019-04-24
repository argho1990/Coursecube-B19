import java.util.*;

public class Lab674 {

    public static void main(String[] args) {

        Calender cal = Calender.getInstance();
        System.out.println(cal);
        Date dt = cal.getTime();
        System.out.println(dt);
        System.out.println("DAY:" + cal.get(Calender.DATE));
        System.out.println("DAY:" + cal.get(Calender.DATE_OF_MONTH));
        System.out.println("MON" + cal.get(cal.get(Calendar.MONTH)));
        System.out.println("MON+1" + cal.get(cal.get(Calendar.MONTH) + 1));
        System.out.println("YEAR" + cal.get(Calender.YEAR));
        System.out.println("HOUR" + cal.get(Calender.HOUR));
        System.out.println("HOUR_OF_DAY" + cal.get(Calender.HOUR_OF_DAY));
        System.out.println("MIN:" + cal.get(Calender.MINUTE));
        System.out.println("SEC" + cal.get(Calender.SECOND));
        System.out.println("AM_PM" + cal.get(Calender.AM_PM));
        System.out.println("\n ADDING 7 DAYS");
        cal.add(Calender.DATE, 7);
        System.out.println(cal.getTime());
        System.out.println("\n set MONTH as MARCH");
        cal.set(Calender.MONTH, Calender.MARCH);
        System.out.println(cal.getTime());

    }

}