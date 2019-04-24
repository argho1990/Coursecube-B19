public class Lab713 {

    public static void main(String[] args) {

        Direction d = Direction.EAST;
        switch (d) {

        case EAST:
            System.out.println("East Direction Selected");
            break;

        case WEST:
            System.out.println("West Direction Selected");
            break;

        case NORTH:
            System.out.println("North Direction Selected");
            break;

        case SOUTH:
            System.out.println("South Direction Selected");
            break;

        }

    }

}

enum Direction {

    EAST, NORTH, WEST, SOUTH;

}