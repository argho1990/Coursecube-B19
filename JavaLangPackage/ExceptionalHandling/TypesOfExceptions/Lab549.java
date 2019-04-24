public class Lab549 {

    public static void main(String[] args) {

        System.out.println("Main Started");

        try {

            String data = args[0];
            int x = Integer.parseInt(data);
            int res = 10 / x;
            System.out.println("Result:" + res);
        }

        catch (NumberFormatException e) {
            System.out.println("Invalid Input");

        }

        System.out.println("Main Completed");
    }
}