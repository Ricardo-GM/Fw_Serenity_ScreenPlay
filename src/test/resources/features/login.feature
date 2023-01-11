@run
Feature: Login

  @ValidLogin
  Scenario: Scenario Outline: As a user, I can log into the member's area

    Given Juan is on the login page
    When Juan logs in with valid credentials
    Then Juan should see a successful login message