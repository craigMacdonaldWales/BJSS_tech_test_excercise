
Feature: Dynamic content (wait until)

  TEST 2:
  Navigate to https://the-internet.herokuapp.com/
  Click Dynamically Loaded Page Elements
  Click Example 2: Element rendered after the fact
  Confirm 'Hello World!' is rendered after the loading bar disappears

@dynamicallyLoadedElement
  Scenario: 'Hello World' is displayed following start button click
    Given I have clicked 'dynamic loading'
    And I have clicked the element rendered after the fact link
    When I click the start button
    Then 'Hello World!' is visible