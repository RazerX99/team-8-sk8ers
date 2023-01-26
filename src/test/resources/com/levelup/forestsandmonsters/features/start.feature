Feature: Start the game

I want to start the game

    Scenario Outline: Start the game
        When the user starts the game
        Then the character is now at position with XCoordinates <endPositionX>
        Examples:
        |startingPositionX|startingPositionY|direction|endPositionX|endPositionY|
        |0|0|NORTH|0|1|

    