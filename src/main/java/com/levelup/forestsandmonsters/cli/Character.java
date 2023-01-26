package com.levelup.forestsandmonsters.cli;

public class Character {
    public String DEFAULT_NAME;
    public String name;

    public Character() {}

    public Character(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void enterMap(GameMap map) {}

    public Position getPosition() {}

    public void move(DIRECTION direction){}
}
