package com.levelup;

import java.awt.Point;
import com.levelup.forestsandmonsters.Position;

public class GameMap {

        public Position positions;
        public Position startingPosition;
        public int numPositions;
        static enum DIRECTION{NORTH,SOUTH,EAST,WEST};
        
        public Position getPositions() {
            return startingPosition;
        }

        public void calculatePosition(Position startingPosition, DIRECTION direction)
        {}

        public boolean isPositionValid(Point positionCoordinates){
            return true;
        }

        public int getTotalPositions(){
            return 1;
        }


}
