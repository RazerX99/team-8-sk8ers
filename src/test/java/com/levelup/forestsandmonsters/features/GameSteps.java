package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameSteps {

    GameController gc;
    String characterName;

    @Given("the character's name is {string}")
    public void givenTheCharactersNameIs(String characterName) {
        this.characterName = characterName;
    }

    @When("the character sets their name")
    public void whenTheCharacterSetsTheirName() {
        gc = new GameController();
        gc.createCharacter(characterName);
    }

    @Then("the Game sets the character's name to {string}")
    public void thenTheGameSetsTheCharactersName(String expectedName) {
        assertEquals(expectedName, gc.getStatus().characterName);
    }

    @Given("the character starts at position with XCoordinates {int}")
    public void the_character_starts_at_position_with_x_coordinates(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("starts at YCoordinates {int}")
    public void starts_at_y_coordinates(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the player choses to move in North")
    public void the_player_choses_to_move_in_north() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the character moves")
    public void the_character_moves() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the character is now at position with XCoordinates {int}")
    public void the_character_is_now_at_position_with_x_coordinates(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("YCoordinates {int}")
    public void y_coordinates(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
