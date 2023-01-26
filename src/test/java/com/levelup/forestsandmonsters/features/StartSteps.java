package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point;

public class StartSteps {

    GameController gc;

    @When("the user starts the game")
        public void theGameStarts() {
            gc = new GameController();
            gc.startGame();
        }
        
    @Then("the map is initialized with number of positions {int}")
    public void the_map_is_initialized_with_num_positions_positions(int numPositions) {
        assertEquals(numPositions, gc.getTotalPositions());
    }

    @Then("the character is at the starting position {word}")
    public void the_character_is_at_the_starting_position_character_starting_position(String coordinatesString) {
        String[] coordinates = coordinatesString.split(",");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        Point expectedCoordinates = new Point(x,y);
        assertEquals(expectedCoordinates, gc.getStatus().currentPosition);
    }    
}