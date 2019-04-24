public class Lab713 {

    public static void main(String[] args) {
        Direction.EAST.show();
        Direction.NORTH.show();
        Direction.WEST.show();
        Direction.SOUTH.show();

    }

}

enum Direction {

    EAST() {
        void show() {

            System.out.println("showing EAST DIRECTION");

        }
    },
    NORTH() {

        void show() {

            System.out.println("showing NORTH DIRECTION");

        }

    },
    WEST() {

        void show() {

            System.out.println("showing WEST DIRECTION");

        }

    },
    SOUTH() {

        void show() {

            System.out.println("showing SOUTH DIRECTION");

        }

    };

    abstract void show();

}