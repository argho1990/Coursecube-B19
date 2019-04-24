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

package p9;

class Lab352C {

    public static void main(String args[]) {

        System.out.println("Package Created in Other Directory in Same Drive");

    }

}

/*
 * Case 3: Relative location: javac -d classes Lab352C.java
 * 
 * java p6.Lab352C
 * 
 */
