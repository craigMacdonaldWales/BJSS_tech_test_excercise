
Feature: button IDs change when red button is clicked

  TEST 1:
  Navigate to https://the-internet.herokuapp.com/
  Click Challenging DOM
  Confirm that the blue, red, and green button ids change after the red button is clicked

@challengingDom
  Scenario: button IDs change when red button is clicked
    Given I have clicked 'challenging DOM'
    And The buttons are present and IDs collected
    When The red button is clicked
    Then the blue, red and green button IDs also change