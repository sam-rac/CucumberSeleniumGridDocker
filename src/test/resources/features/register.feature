Feature: User Registration
  As a new user
  I want to be able to register on the website
  So that I can access the platform

  @LoginTest
  Scenario: Successful user registration
    Given I am on the registration page
    And I click the "SignupOrLogin" button
    When I fill in the following information:
      | Email                  | Password     |
      | gabimi7734@pbridal.com | gabimi7734@1 |
    And I click the "Signup" button
    And I enter AccountAndAddress information
      | Name         | JohnDoe                |
      | Email        | gabimi7734@pbridal.com |
      | Password     | gabimi7734@1           |
      | First Name   | John                   |
      | Last Name    | Doe                    |
      | Address      | Downing street         |
      | State        | Oregon                 |
      | City         | Hillsboro              |
      | Zipcode      | 110022                 |
      | MobileNumber | 01234567890            |
    Then I should see a success message
    And I should be logged in as "JohnDoe"

#  Scenario: User registration with missing information
#    Given I am on the registration page
#    When I fill in the following information:
#      | First Name | John     |
#      | Email      | john@example.com |
#    And I click the "Register" button
#    Then I should see an error message indicating missing information
#
#  Scenario: User registration with existing email
#    Given I am on the registration page
#    When I fill in the following information:
#      | First Name | John     |
#      | Last Name  | Doe      |
#      | Email      | john@example.com |
#      | Password   | securepwd|
#    And I click the "Register" button
#    Then I should see an error message indicating the email is already registered
