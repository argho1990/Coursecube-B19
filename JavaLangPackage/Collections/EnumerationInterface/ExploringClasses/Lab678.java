import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Lab678 {

    public static void main(String args) throws Exception {

        Locale loc = Locale.getDefault();
        System.out.println(loc.getCountry());
        System.out.println(loc.getDisplayCountry);
        System.out.println(loc.getLanguage());
        System.out.println(loc.getDisplayLanguage());
        Locale locs[] = Locale.getAvailableLocales();
        for (int i = 0; i < locs.length; i++) {

            Locale I = locs[i];
            System.out.println(I.getDisplayLanguage() + "\t\t" + I.getDisplayCountry());

        }
    }

}