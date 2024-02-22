Feature: Login feature to Sauce Labs application

  Scenario: Test login with valid credentials
    Given I navigate to sauce_labs application
    When I insert username and password
    And I click login button
    Then I am on home page