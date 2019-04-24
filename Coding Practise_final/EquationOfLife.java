import java.util.Scanner; 
class Knowledge extends Life{}
class Perception extends Knowledge{}
class Travel extends Life{}
class Places extends Travel{}
class Life{
      public static void main(String args[]){
      Life life = new Life(); 
      Knowledge K = new Perception();    
      Travel T = new Places();
      
      //Expected days to live:
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your age");
      int Age = in.nextInt(); 
      int Years=100-Age;
      int months= Years * 12;
      int days = months * 365;
      System.out.println("Time Left"+" : "+Years+ " "+"years"+ " "+"expected");
      System.out.println("or"+" : "+months+" "+"months");
      System.out.println("or"+" : "+days+" "+"days");  
      }

}
