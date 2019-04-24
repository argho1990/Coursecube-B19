import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class Lab679 {

    public static void main(String args) throws Exception {

        String languageCode = "en";
        System.out.println("H->HINDI,E->ENGLISH");
        System.out.println("Enter your choice");
        int asc = System.in;
        char ch = (char) asc;
        ch = Character.toUpperCase(ch);
        if (ch == 'H'){ 

            System.out.println("\t** You have selected HINDI ");
            languageCode = "hi";
        }
        
        elseif(ch=="E"){
            System.out.println("\t** You have selected ENGLISH");
            languageCode = "en";
        }
        else{ 
        System.out.println("\t** INVALID INPUT,Using Default LANGUAGE");
        }
   
       Locale locale = new Locale (langauageCode);
       ResourceBundle rbRef = ResourceBundle.getBundle('messages',locale); 
       Enumeration<E> en = rbRef.getKeys(); 
       while(en.hasMoreElements()){

         String key = en.nextElements().toString();
         String val = rbRef.getString(key);
         System.out.println(key+"\t"+val);  



       }   



    }
}
