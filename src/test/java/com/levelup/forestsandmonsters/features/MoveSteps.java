package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Point;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoveSteps {

    GameController gc;
    int startX, startY, endX, endY;
    GameController.DIRECTION direction;
    Point currentPosition;

    @Given("the character starts at position with XCoordinates {int}")
        public void givenTheCharacterStartsAtX(int startX) {
            this.startX = startX;
        }
    @Given("starts at YCoordinates {int}")
        public void givenTheCharacterStartsAtY(int startY) {
            this.startY = startY;
        }

    @Given("the player choses to move in {word}")
        public void givenPlayerChoosesDirection(String direction) {
            this.direction = GameController.DIRECTION.valueOf(direction);
        }

    @When("the character moves")
        public void theCharacterMoves() {
            gc = new GameController();
            gc.setCharacterPosition(new Point(this.startX, this.startY));
            gc.move(this.direction);

            this.currentPosition = gc.getStatus().currentPosition;
        }

    @Then("the character is now at position with XCoordinates {int}")
        public void checkXCoordinates(int endX) {
            assertNotNull("Expected position not null", this.currentPosition.x);
            assertEquals(endX, this.currentPosition.x);
        }
    @Then("YCoordinates {int}")
        public void checkYCoordinates(int endY) {
            assertNotNull("Expected position not null", this.currentPosition.y);
            assertEquals(endY, this.currentPosition.y);
        }
}
