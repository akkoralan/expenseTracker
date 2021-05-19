
Feature: Login feature
@wip
  Scenario: login as registered user
    Given registered user is on the login page
    When the user enter login informations
    Then the user should be able to login