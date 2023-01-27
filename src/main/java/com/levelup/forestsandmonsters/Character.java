package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.GameController.DIRECTION;


public class Character {
    public static String DEFAULT_NAME;
    public String name;
    public GameController DIRECTION;
    public GameMap map; 
    public Position currentPosition;
    public int moveCount;

    public Character() {
    
    }

    public Character(String name) {
        this.name=name;
        this.map = new GameMap();
        this.currentPosition = new Position(1,1);
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

    public void enterMap(GameMap map) {
      this.map=map;

    }

    public Position getPosition() {
        return this.currentPosition;
    }

    public void move(DIRECTION direction){
        this.currentPosition = map.calculatePosition(this.currentPosition, direction);
    }

//    public GameMap getMap(){
//         return ma
//     }

//     public void setMap(GameMap map){
//         this.map=map;
//     }

}
