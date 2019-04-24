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

package p7;

class Lab352B {

    public static void main(String args[]) {

        System.out.println("Package Created in Current Directory");

    }

}

/*
 * Case 2: Relative location: javac -d . Lab352A.java
 * 
 * java p6.Lab352B
 * 
 */
