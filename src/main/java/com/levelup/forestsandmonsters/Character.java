package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.GameController.DIRECTION;

//import com.levelup.forestsandmonsters.cli.GameMap;

public class Character {
    public static String DEFAULT_NAME;
    public String name;
    public GameController DIRECTION;
    public GameMap map; 
    public Position currentPosition;
    public int moveCount;

    public Character() {}

    public Character(String name) {
        this.name=name;
    }

    public void setMoveCount(int m){
        this.moveCount=m;
    }

    public int getMoveCount(){
        return this.moveCount;
    }

    public String getName() {
        return this.name;
    }

    public void enterMap(GameMap map) {}

    public Position getPosition() {
        return new Position(0, 0);
    }

    public void move(DIRECTION direction){}

//    public GameMap getMap(){
//         return ma
//     }

//     public void setMap(GameMap map){
//         this.map=map;
//     }

}
