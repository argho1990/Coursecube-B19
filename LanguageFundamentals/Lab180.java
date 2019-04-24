class Lab180 {

    public static void main(String as[]) {

        for (int i = 0; i < 5; i++) {

            System.out.println("\n" + 1);
            for (int j = 1; j <= 5; j++, System.out.println("J++")) {
                if (i == 3)
                    break;
                System.out.println("JLC" + j);

            }

        }
    }
}
