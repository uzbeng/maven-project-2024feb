@Tag1
Feature: Parameters within the test steps

  @AnyName
  Scenario: Take user input
    Given I navigate to website "http://google.com"
    When User inserts username "user123" and password "pass123"
    Then The result is 56

  @Smoke @DbTest
  Scenario: Take user input
    Given I navigate to website "http://facebook.com"
    When User inserts username "abdfs" and password "4398534750498"

  @Regression
  Scenario: Take user input
    Given I navigate to website "http://amazon.com"
    When User inserts username "asdklffj" and password "fdg876"