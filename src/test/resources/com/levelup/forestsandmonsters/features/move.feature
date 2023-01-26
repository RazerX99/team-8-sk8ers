Feature: Move in a direction

I want to move my character. If they attempt to move past a boundary, the move resutls in no change in position.

    Scenario Outline: Move in a direction 
        Given the character starts at position with XCoordinates <startingPositionX>
        And starts at YCoordinates <startingPositionY>
        And the player choses to move in <direction>
        When the character moves
        Then the character is now at position with XCoordinates <endPositionX>
        And YCoordinates <endPositionY>
        Examples:
        |startingPositionX|startingPositionY|direction|endPositionX|endPositionY|
        |0|0|NORTH|0|1|

    