package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.Point;
import com.levelup.forestsandmonsters.Position;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GameMapTest {
    @Test
    public void initializationCreates100Positions() {
        GameMap testObj = new GameMap(10,10);

        assertEquals(10, testObj.maxPosition.getCoordinates().x);
        assertEquals(10, testObj.maxPosition.getCoordinates().y);
    }

    @Test
    public void initializationCreatesPositionsWithCorrectCoordinates() {
        GameMap testObj = new GameMap(10,10);

        Point expectedLowerLeft = new Point(1,1);
        Point expectedUpperRight = new Point(10, 10);

        assertEquals(expectedLowerLeft,testObj.minPosition.getCoordinates());
        assertEquals(expectedUpperRight, testObj.maxPosition.getCoordinates());
    }
/*
    @Test
    public void calculatePositionForNorthWhenInMiddleOfMap() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[1][2];
        Point expectedEndPositionCoordinates = new Point(1,3);
        GameController.DIRECTION direction = GameController.DIRECTION.NORTH;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }

    @Test
    public void calculatePositionForSouthWhenInMiddleOfMap() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[1][2];
        Point expectedEndPositionCoordinates = new Point(1, 1);
        GameController.DIRECTION direction = GameController.DIRECTION.SOUTH;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }

    @Test
    public void calculatePositionForWestWhenInMiddleOfMap() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[1][2];
        Point expectedEndPositionCoordinates = new Point(0, 2);
        GameController.DIRECTION direction = GameController.DIRECTION.WEST;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }

    @Test
    public void calculatePositionForEastWhenInMiddleOfMap() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[1][2];
        Point expectedEndPositionCoordinates = new Point(2, 2);
        GameController.DIRECTION direction = GameController.DIRECTION.EAST;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }

    @Test
    public void calculatePositionForNorthWhenOnBoundary() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[2][9];
        Point expectedEndPositionCoordinates = new Point(2, 9);
        GameController.DIRECTION direction = GameController.DIRECTION.NORTH;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }

    @Test
    public void calculatePositionForSouthWhenOnBoundary() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[2][0];
        Point expectedEndPositionCoordinates = new Point(2, 0);
        GameController.DIRECTION direction = GameController.DIRECTION.SOUTH;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }

    @Test
    public void calculatePositionForWestWhenOnBoundary() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[0][5];
        Point expectedEndPositionCoordinates = new Point(0, 5);
        GameController.DIRECTION direction = GameController.DIRECTION.WEST;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }

    @Test
    public void calculatePositionForEastWhenOnBoundary() {
        GameMap testObj = new GameMap();

        Position startingPosition = testObj.getPositions()[9][3];
        Point expectedEndPositionCoordinates = new Point(9, 3);
        GameController.DIRECTION direction = GameController.DIRECTION.EAST;

        Position newPosition = testObj.calculatePosition(startingPosition, direction);

        assertEquals(expectedEndPositionCoordinates, newPosition.coordinates);
    }
    
    @Test
    public void isPositionValidIsTrueForValidPosition() {
        GameMap testObj = new GameMap();

        Point validPositionCoordinates = new Point(1,2);
        assertTrue(testObj.isPositionValid(validPositionCoordinates));
    }

    @Test
    public void isPositionValidIsFalseForInValidPosition() {
        GameMap testObj = new GameMap();

        Point badXPositionCoordinates = new Point(-1, 9);
        assertFalse(testObj.isPositionValid(badXPositionCoordinates));

        Point badYPositionCoordinates = new Point(2, 11);
        assertFalse(testObj.isPositionValid(badYPositionCoordinates));

        Point badPositionCoordinates = new Point(-4, 11);
        assertFalse(testObj.isPositionValid(badPositionCoordinates));
    }
     */
}
