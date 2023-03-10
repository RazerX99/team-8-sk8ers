package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    // TODO: If your stakeholder wants to call this CHARACTER, change var name for
    // low representational gap
    static final String DEFAULT_CHARACTER_NAME = "Character";
    private GameMap gameMap = new GameMap();
    private Character character;
    public static enum DIRECTION{NORTH, SOUTH, EAST, WEST};


    public class GameStatus {
        // TODO: Add other status data
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;

        public GameStatus(){
       }
    }

    GameStatus status=new GameStatus();
    public String characterName= DEFAULT_CHARACTER_NAME;
    public Point currentPosition = null;

    public  GameController() {
        status = new GameStatus();
        this.currentPosition=gameMap.minPosition.coordinates;
        createCharacter(DEFAULT_CHARACTER_NAME);
        
    }

    public void setCharacterPosition(Point coordinates){
        //TODO: Implement this to set characters current positions
        this.character.currentPosition = new Position(coordinates);
        //this.currentPosition.x = coordinates.x;
        //this.currentPosition.y = coordinates.y;
    }

    // TODO: Ensure this AND CLI commands match domain model
    //public static enum DIRECTION {NORTH, SOUTH, EAST, WEST}
    


    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals(""))
            status.characterName = name;

        character = new Character(status.characterName);
    }

    public void startGame() {
         this.gameMap = new GameMap();
        if (character == null)
        {
            createCharacter(DEFAULT_CHARACTER_NAME);
        }
        //status.characterName=this.characterName;
        this.currentPosition=gameMap.minPosition.coordinates;
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
        character.move(directionToMove);
        this.status.currentPosition = character.currentPosition.getCoordinates();


    }

    public int getTotalPositions()
    {
        //TODO: return a real value, just a placeholder
        return gameMap.numPositions;
    }
}