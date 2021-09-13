
  Feature: Entering Transaction Details
@trans
    Scenario: Authorized user should be able to enter transaction details to

      Given User is on "Transactions" page
      When  user enter "13/09/2021" "Nandos" and "15.99"
      And   after clicking submit button
      Then  user should see the the entered details on the screen