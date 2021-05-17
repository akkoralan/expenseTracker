
Feature: Login feature
  @wip
  Scenario: login as registered user
    Given the user is on the login page and registered
    When the user enter login informations
    Then the user should be able to login