Feature: Register feature
@api
  Scenario Outline: User should be able to register with required information

    Given user on register page
    When user enter "<userName>" "<userEmail>" "<userPassword>"
    When user sends POST request to "/api/register"
    Then status code 200
    And content type should be "application/json; charset=utf-8"
    And json payload/response should contain: "You have been successfully registered" message
    And same data what is posted
    Then user should be able to register and on the login page

    Examples:
      | userName | userEmail       | userPassword |
      | Ahmet     | ahmet@ahmet.com   | Ahmet123$     |
      | Mehmet     | mehmet@mehmet.com   | Mehmet123$     |
      | Osman    | osman@osman.com | Osman123$   |