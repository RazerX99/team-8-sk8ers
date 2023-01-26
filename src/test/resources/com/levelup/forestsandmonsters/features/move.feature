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
        |1|1|NORTH|1|2|
        |1|1|SOUTH|1|1|
        |1|1|EAST|2|1|
        |1|1|WEST|1|1|
        |10|10|NORTH|10|10|
        |10|10|SOUTH|10|9|
        |10|10|EAST|10|10|
        |10|10|WEST|9|10|
        |1|10|NORTH|1|10|
        |1|10|SOUTH|1|9|
        |1|10|EAST|2|10|
        |1|10|WEST|1|10|
        |10|1|NORTH|10|2|
        |10|1|SOUTH|10|1|
        |10|1|EAST|10|1|
        |10|1|WEST|9|1|