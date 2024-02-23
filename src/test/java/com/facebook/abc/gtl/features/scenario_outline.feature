Feature: Using examples table

  Background: This one runs before each scenario
    Given Driver is initialized

  @Smoke
  Scenario Outline: Using example
    Given Username <username> and Password <password>

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |

    @Step
  Scenario: Take user input
    Given I navigate to website "http://google.com"
    When User inserts username "user123" and password "pass123"
    Then The result is 56