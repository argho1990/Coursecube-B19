public class EFL3 {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4 };// First Element itself is an Array...
        int b[] = { 2, 4, 6, 8 };// 2nd Element itself is an Array..
        int c[] = { 5, 6, 7, 8, 9 };// 3rd Element itself is an Array...

        int d[][] = { { 1, 2, 3, 4 }, { 2, 4, 8 }, { 5, 6, 7, 8 } };

        /*
         * for (int i = 0; i < d.length; i++) {
         * 
         * for (int j = 0; j < d[i].length; j++) {
         * 
         * System.out.println("" + d[i][j]); } System.out.println();
         * 
         * }
         */

        /*
         * d---> 1234 248 56789 k--> 1234
         * 
         * 
         */

        // K needs to be array not a normal int variable
        for (int k[] : d) {
            //
            for (int l : k) {
                System.out.print(" " + l);

            }
            System.out.println();// new line
        }

    }
}