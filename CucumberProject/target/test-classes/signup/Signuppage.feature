Feature: Signup Page

  @SmokeTest
  Scenario: Signup with proper details
    Given Navigate to url
    When Insert all require details and click on signup button
      | First Name | Last Name | Address | Mobile number |
      | Pallavi    | Raut      | Wardha  |    9561732684 |
    Then Pop message with successfully signup

  @RegTest
  Scenario: Signup with proper details
    Given Navigate to url
    When Insert all require details and click on signup button
      | First Name | Last Name | Address | Mobile number |
      | Nikita     | Raut      | Wardha  |    9561732684 |
    Then Pop message with successfully signup

  @SmokeTest
  Scenario: Signup with proper details
    Given Navigate to url
    When Insert all require details and click on signup button
      | First Name | Last Name | Address | Mobile number |
      | Sakshi     | Raut      | Wardha  |    9561732684 |
    Then Pop message with successfully signup

  @RegTest
  Scenario: Signup with proper details
    Given Navigate to url
    When Insert all require details and click on signup button
      | First Name | Last Name | Address | Mobile number |
      | Nitin      | Raut      | Wardha  |    9561732684 |
    Then Pop message with successfully signup

  @SmokeTest
  Scenario: Signup with proper details
    Given Navigate to url
    When Insert all require details and click on signup button
      | First Name | Last Name | Address | Mobile number |
      | Pravin     | Raut      | Wardha  |    9561732684 |
    Then Pop message with successfully signup
