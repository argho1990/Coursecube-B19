public class Lab454 {

    public static void main(String[] args) {
        System.out.println("** MAIN STARTED");
        Runtime rt = Runtime.getRuntime();
        System.out.println("T:" + rt.TotalMemory());
        System.out.println("M:" + rt.maxMemory());
    }
}