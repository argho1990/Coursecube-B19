public class MainMap {

    public static void main(String args[]) {
        System.out.println(" ================================================================ ");
        System.out.println(" ================================================================ ");
        MainMap NewWorld = new MainMap();
        Orc orc1 = new Orc();
        orc1.setHeight(17);
        System.out.println(" Main Map : " + " (Actual Orcs) " + " : " + orc1.getHeight() + " inches ");
        System.out.println(" ================================================================ ");
        System.out.println(" ================================================================ ");
        Expansion NewMap = new Expansion();
        Orc orc2 = new Orc();
        orc2.setHeight(5);
        System.out.println(" Main Map : " + " (Actual Orcs) " + " : " + orc2.getHeight() + " inches ");
        System.out.println(" ================================================================ ");
        System.out.println(" ================================================================ ");
    }
}