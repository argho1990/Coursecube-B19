/*
 * 
 * 1.main() method is a special method which will be called by the JVM. 2.main()
 * method has the standard signature as follows:
 * 
 * 3.public static void main(String[] args){} 4.static public static void
 * main(String[] args){}
 * 
 * You can overload main() method but JVM always invokes main method() with
 * standard signature. main() method works as application launcher i.e it is
 * starting point of your application.
 * 
 * Explanation of main() method
 * 
 * public: It can be accessed from anywhere. static: It can be acccessed using
 * Class Name directly. void : It will not return any value to caller (JVM).
 * main: Method Name(Taken from c,c++) String[]: To pass command line values.
 * 
 */

public class Lab319 {

    static {

        System.out.println("I am S.B");
    }

    /*
     * Before Java 7 Loads the class It checks whether main() method with standard
     * signature available or not. If available then invokes the main() method. If
     * not available then JVM will throw "java.lang.NoSuchMethodError:main" error.
     * 
     * Java 7 onwards It checks whether main() method with standard signature
     * available or not. If available then loads the class first and invokes main()
     * method. If not available then JVM will throw error, Main method not found in
     * class Hello,please define the main method as: public static void
     * main(String[] args)
     * 
     */

    public static void main(String args) {

        System.out.println("I am main()");

    }

}
