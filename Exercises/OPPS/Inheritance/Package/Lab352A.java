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

package p6;

class Lab352A {

    public static void main(String args[]) {

        System.out.println("Package Created in Same Directory");

    }

}

/*
 * Case 1: Absolute location: javac -d =>
 * C:\Users\ticklu\Desktop\B19\Exercises\OPPS\Inheritance\Package\PACK_NAME
 * Lab352A.java => cd PACK java p6.Lab352
 * 
 *
 * 
 */
