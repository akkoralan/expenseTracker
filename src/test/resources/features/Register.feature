Feature: Register feature
@wip
  Scenario Outline: User should be able to register with required information

    Given user on register page
    When user enter "<userName>" "<userEmail>" "<userPassword>"
    Then user should be able to register and on the login page

    Examples:
      | userName | userEmail       | userPassword |
      | Jack     | jack@jack.com   | jackjack     |
      | Omar     | omar@omar.com   | omaromar     |
      | Petra    | petra@petra.com | petrapetra   |