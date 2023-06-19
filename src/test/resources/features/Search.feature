@Search
Feature: Search Wikipedia
  Scenario: Look for Mafia
    Given I go to the website
    When I type the word Mafia
    And I click search button
    Then I go to the mafia page