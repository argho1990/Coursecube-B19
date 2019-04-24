import java.util.*;

public class Lab715 {

    public static void main(String[] args) {

        Set<Direction> set = EnumSet.allOf(Direction.class);
        System.out.println(set);
        Map<Direction, Integer> map = new EnumMap<Direction, Integer>(Direction.class);
        map.put(Direction.EAST, 0);
        map.put(Direction.NORTH, 90);
        map.put(Direction.WEST, 180);
        map.put(Direction.SOUTH, 270);
        System.out.println(map);

    }

}

enum Direction {

    EAST, WEST, NORTH, SOUTH

}