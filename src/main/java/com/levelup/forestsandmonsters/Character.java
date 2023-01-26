package com.levelup.forestsandmonsters;

//import com.levelup.forestsandmonsters.cli.GameMap;
public class Character {
    public String DEFAULT_NAME;
    public String name;
    static enum DIRECTION{NORTH,SOUTH,EAST,WEST};


    public Character() {}

    public Character(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void enterMap(GameMap map) {}

    public Position getPosition() {
        return new Position(0, 0);
    }

    public void move(DIRECTION direction){}
}
