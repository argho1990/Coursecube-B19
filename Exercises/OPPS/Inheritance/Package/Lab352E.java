/*

Syntax:
javac -d <Location> <SourceFileName>.java

Ex:
javac -d . Lab.java

=> Here dot(.) is used as Location,so package will be created in the current working directory.

=> If you want to create the package in specified directory instead of current working directory then you have to
   specify the location.

=> Assume current working current working directory is D:\JLC\Core\pack

*/

package p11;

class lab352E {

    public static void main(String args[]) {

        System.out.println("Package Created in Other Directory in Same Drive");

    }

}

/*
 * Case 5: Absolute location: javac -d Lab352D.java
 * 
 * java p6.Lab352C
 * 
 */
