Feature: Start the game

I want to start the game

    Scenario Outline: Start the game
        When the user starts the game
        Then the map is initialized with number of positions <numOfPositions>
        And the character is at the starting position <startPosition>
        Examples:
       # |numOfPositions|startPosition|
      #  |100|1,1|