public class EFL2 {

    public static void main(String args[]) {

        int a[] = { 1, 2, 3, 4 };
        /*
         * for (int i = 0; i < 4; i++) {
         * 
         * System.out.println(a[i]);
         * 
         * }
         */
        // U dont have to keep the track of the numbers.
        // [int i = 0,1,2,3,4]
        // Get rid of bugs (=>,<=)

        for (int k : a) {

            System.out.println(k);

        }

    }

}