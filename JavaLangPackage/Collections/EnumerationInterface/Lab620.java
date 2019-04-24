import java.util.*;

public class Lab620 {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Shri");
        list.add("Nivas");
        list.add("Java");
        list.add("JDBC");
        list.add("JSP");

        ListIterator it = list.ListIterator(2);
        do{
  
          int indx = lit.nextIndex();
          Object obj = lit.next();
          System.out.println(indx+"\t"+obj);
        }while(it.hasNext());
       
         System.out.println();
         lit = list.listIterator(5);
         do{

          int indx = lit.previousIndex();
          Object obj = lit.previous();
          System.out.println(indx+"\t"+obj);
         }while(lit.hasPrevious());


         } 


}

}
