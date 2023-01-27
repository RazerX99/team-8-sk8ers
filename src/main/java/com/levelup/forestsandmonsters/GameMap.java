package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.*;

public class GameMap {

    public Position[][] positions;
    public Position[][] startingPosition;
    public int numPositions;
    public String directionProvided;
    public Position[][] STUBBED_NEW_POSITION;

    public Position[][] getPositions() {
        return startingPosition;
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {

        //Create a copy of the startingPosition
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
        return newPosition;
    }

    public boolean isPositionValid(Point positionCoordinates) {
        return true;
    }

    public int getTotalPositions() {
        return 1;
    }

}
