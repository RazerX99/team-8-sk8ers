package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Test {
    

    public static void main(String[] args) {

        System.out.println("starting test");

        Position p1 = new Position(1,1);
        System.out.println("p1 coordinates X=" + p1.coordinates.x + " Y=" + p1.coordinates.y);

        GameMap gm = new GameMap();

        Position p2 = gm.calculatePosition(p1, DIRECTION.SOUTH);

        System.out.println("p2 coordinates X=" + p2.coordinates.x + " Y=" + p2.coordinates.y);
        System.out.println("p1 coordinates X=" + p1.coordinates.x + " Y=" + p1.coordinates.y);
        
    }
}
