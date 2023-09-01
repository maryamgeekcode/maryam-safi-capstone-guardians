Feature: Sign in

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @SignIn
  Scenario: Verify User can sign in into Retial Application
    And User enter email 'guardianstudent@tekschool.us' and password 'Guardian@4'
    And User click on login button
    Then User should be logged in into Account

  @Register
  Scenario Outline: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User enter '<name>' and '<email>' and '<password>' and '<confirmPassword>'
    And User click on SignUp button
    Then User should be logged into account page

    Examples: 
      | name     | email                 | password   | confirmPassword |
      | guardian | fgrstudent@tekschool.us | Guardian@4 | Guardian@4      |
