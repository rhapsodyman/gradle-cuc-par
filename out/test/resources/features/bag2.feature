Feature: Bag functionalities2

  Scenario: Putting one thing in the bag2
    Given the bag is empty
    When I put 1 potato in the bag
    Then the bag should contain only 1 potato
    And process id is

  Scenario Outline: Scenario outline example
    Given the bag is empty
    And process id is

    Examples:
    | name |
    | name |
    | name |
    