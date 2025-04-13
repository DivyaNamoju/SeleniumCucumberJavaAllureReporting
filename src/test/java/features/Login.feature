Feature: Login functionality
  Scenario: Validate user navigates to homepage when logs in with valid user credentials
    When user is on login page
    And enters username and password
    And clicks on submit
    Then user navigates to homepage