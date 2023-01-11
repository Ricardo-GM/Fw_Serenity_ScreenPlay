@Login
Feature: Login

  @ValidLogin
  Scenario: As a user, I can log into the member's area with valid credentials

    Given Juan is on the login page
    When Juan logs in with valid credentials
    Then Juan should see a successful login message

  @InvalidLogin
  Scenario: As a user, I can 't log into the member's area with invalid credentials

    Given Juan is on the login page
    When Juan logs in with invalid credentials
    Then Juan should see a failure login message