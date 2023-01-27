package com.levelup.forestsandmonsters;

import java.awt.Point;

public class Position {

    public Point coordinates;

    public Position(int xCoordinates, int yCoordinates) {
        this.coordinates = new Point(xCoordinates, yCoordinates);
    }

    //Overload constructor to assist in quick copy of a Position object.
    public Position(Point coordinates) {
        this.coordinates = new Point(coordinates.x, coordinates.y);
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public Position clonePosition ()
    {
        return new Position(this.coordinates);
    }
}