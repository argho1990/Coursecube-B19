public class Lab546 {

    public static void main(String[] args) {
        try {

            String data = args[0];
            int x = Integer.parseInt(data);
            int res = 10 / x;
            System.out.println("Result:" + res);
        } catch (ArrayIndexOutOfBoundException e) {

            System.out.println("Provide one Value as CLA");

        }

        catch (NumberFormatException e) {
            System.out.println("Privide int value as CLA");

        }

        catch (ArithmeticException e) {
            System.out.println("Privide non zero int value as CLA");

        }

        System.out.println("Main Completed");
    }
}