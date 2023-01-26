package com.levelup.forestsandmonsters.cli;

import java.awt.Point;

public class Gamemap {

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
