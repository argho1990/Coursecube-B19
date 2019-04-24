/*

 If you want to access a class from different package then
=> That class must be public 
=> That package must available in the classpath.
=> That package information must be specified.

*/

package p14;

public class Lab356B {

    public static void main(String args[]) {

        Hello hello = new Hello();
        hello.show();
        Hai hai = new Hai();
        hai.display();
    }
}
