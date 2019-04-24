public class Lab572 {

    public static void main(String[] args) {

        Student sarr[] = new Student[500];
        try {

            for (int i = 0; i < sarr.length; i++) {

                sarr[i] = new Student();
                System.out.println((i + 1) + "Object created");
            }
        } catch (Error e) {

            System.out.println("\n** Error Occurred" + e);
        }
        System.out.println("\n After Handling");
        Student st = new Student();

    }
}

class Student {

    long arr[] = new long[215833];

}
