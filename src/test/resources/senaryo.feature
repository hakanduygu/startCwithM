@regression
Feature: maven test
  Scenario: opening chrome and test with maven
    Given website
    And login
    When logged in
    Then go dm