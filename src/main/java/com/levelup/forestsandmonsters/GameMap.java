package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.*;

public class GameMap {

    public int numPositions;
    public String directionProvided;
    public Position minPosition;
    public Position maxPosition;
    
    public GameMap() {

        minPosition = new Position(1,1);
        maxPosition = new Position(10,10); 
    }

    //Overloaded constructor to make the map larger, pass the max x, y coordinates
    public GameMap(int xCoordinates, int yCoordinates) {
        
        minPosition = new Position(1,1);
        maxPosition = new Position(xCoordinates,yCoordinates); 
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {

        // Create a copy of the startingPosition
        Position newPosition = startingPosition.clonePosition();

        if (direction == DIRECTION.NORTH) {
            newPosition.coordinates.y++;
        } else if (direction == DIRECTION.SOUTH) {
            newPosition.coordinates.y--;
        } else if (direction == DIRECTION.EAST) {
            newPosition.coordinates.x++;
        } else {
            newPosition.coordinates.x--;
        }

        if (isPositionValid(newPosition))
            return newPosition;

        return startingPosition;
    }

    public boolean isPositionValid(Position position) {

        if (position.getCoordinates().x < 1 || position.getCoordinates().x > 10 || position.getCoordinates().y < 1
                || position.getCoordinates().y > 10)
            return false;

        return true;
    }

    public int getTotalPositions() {
        return 1;
    }



}