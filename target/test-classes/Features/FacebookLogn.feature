Feature: Validate teh Login in facebook Homepage

  @tag1
  Scenario: Valid user name and password
    Given Launch the Browser
    And Open the Application
    When user enter the valid username and password
    Then user click on login button
    And validate the login message
    And close the browser

  Scenario: InValid user name and valid password
    Given Launch the Browser
    And Open the Application
    When user enter the Invalid username and valid password
    Then user click on login button
    And validate the login message
    And close the browser
