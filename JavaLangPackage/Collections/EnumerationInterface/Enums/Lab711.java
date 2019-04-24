public class Lab710 {

    public static void main(String[] args) {

        Direction d1 = null;
        d1 = new Direction().EAST;
        System.out.println(d1);
        System.out.println(Direction.NORTH);
        System.out.println(Direction.WEST);
        System.out.println(Direction.SOUTH);

    }

}

enum Direction {

    EAST, NORTH, WEST, SOUTH;

    static {

        System.out.println("** Static Block in Direction class \n ");
    }

    Direction() {
        System.out.println("Direction(String,int)Cons");

    }

}