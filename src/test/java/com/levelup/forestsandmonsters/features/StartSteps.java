package com.levelup.forestsandmonsters.features;

import com.levelup.forestsandmonsters.GameController;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StartSteps {

    GameController gc;

    @When("the user starts the game")
        public void theGameStarts() {
            gc = new GameController();
            gc.startGame();
            
        }   
}