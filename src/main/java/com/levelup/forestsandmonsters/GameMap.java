package com.levelup.forestsandmonsters;

import java.awt.Point;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;

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

        public Position calculatePosition(Position startingPosition, DIRECTION direction){
            if(direction == DIRECTION.NORTH){
                startingPosition.coordinates.y++;
            }
            else if(direction == DIRECTION.SOUTH){
                startingPosition.coordinates.y--;
            }
            else  if(direction == DIRECTION.EAST){
                startingPosition.coordinates.x++;
            }
            else {
                startingPosition.coordinates.x--;
            }
            return startingPosition;
        }

        public boolean isPositionValid(Point positionCoordinates){
            return true;
        }

        public int getTotalPositions(){
            return 1;
        }


}
