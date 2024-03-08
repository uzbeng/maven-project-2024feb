@Junit
Feature: Login feature to Sauce Labs application

  @SauceLabs
  Scenario: Test login with valid credentials
    Given I navigate to url "https://www.saucedemo.com/"
    When I insert value "standard_user" into box "//*[@id='user-name']"
    When I insert value "secret_sauce" into box "//*[@id='password']"
    And I click element with locator "//*[@id='login-button']"
    Then I am on home page

  @SauceLabs
  Scenario: Test login with valid credentials
    Given I navigate to application "Facebook"
    When I insert value "standard_user" into box "Login"
    When I insert value "secret_sauce" into box "//*[@id='password']"
    And I click button "LoginButton"
    And I am on home page
    Then I am on home page

  @Facebook
  Scenario: Test login with valid credentials
    Given I navigate to url "https://www.facebook.com/"
    When I insert value "standard_user" into box "//*[@id='email']"
    When I insert value "secret_sauce" into box "//*[@id='pass']"
    And I click element with locator "//*[@name='login']"
    Then I verify the message to be "Successfully logged in" for element "//*[@name='']"

#  @SauceLabs
#  Scenario: Test login with valid credentials
#    Given I navigate to sauce_labs application
#    When I insert username and password
#    And I click login button
#    Then I am on home page
#
#  @SauceLabs
#  Scenario: Test login with valid credentials
#    Given I navigate to sauce_labs application
#    When I insert username and password
#    And I click login button
#    Then I am on home page