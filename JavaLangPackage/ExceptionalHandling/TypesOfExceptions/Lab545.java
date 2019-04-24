public class Lab545 {

    public static void main(String[] args) {
        try {

            String data = args[0];
            int x = Integer.parseInt(data);
            int res = 10 / x;
            System.out.println("Result:" + res);
        } catch (Exception e) {

            System.out.println("Enter Correct Value");

        }

        System.out.println("Main Completed");
    }
}