public class LabMil {
    public static void main(Strings args[]) {
        int i = 10;
        int j = 20;

        int k = i++ + ++i + j++ + ++j + j++ + i++;
        System.out.println(i);
        System.out.println(k);
        System.out.println(j);
    }

}