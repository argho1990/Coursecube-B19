public class Lab530 {

    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        Process p = rt.exec("mspaint");

        String cmds[] = {"notepad","D:\\Welcome.txt"};
        Process p2 = rt.exec(cmds);

        String cmds1[] = {"C:\\Program Files\\Mozilla Firefox\\firefox.exe","http://www.jlcindia.com"}
        Process p3 = rt.exec(cmds1);

        System.out.println("Press ENTER to close all process");
        System.in.read();
        p.destroy();
        p2.destroy();
        p3.destroy();
        System.out.println("Main Completed");

    }

}