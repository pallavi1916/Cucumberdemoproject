Feature: Signup Page

 
  Scenario: Signup with proper details
    Given Navigate to Direct url
    When Insert all require details and click on button
      | First Name | Last Name | Mobile Number | Work Email  | Job Title  |
      | Nikita     | Darunde   |    1234567890 | p@gmail.com | IT Manager |
    Then Successfully signup

  @RegTest
  Scenario: Signup with proper details
    Given Navigate to Direct url
    When Insert all require details and click on button
      | First Name | Last Name | Mobile Number | Work Email  | Job Title  |
      | Nikita     | Darunde   |    1234567890 | p@gmail.com | IT Manager |
    Then Successfully signup
 @SmokeTest
  Scenario Outline: 
  Given Navigate to Direct url
  When Multiple <First Name>
  Then Successfully signup
  
  Examples:
    |First Name| 
    |Nikita|
    |Nikita1|
    |Nikita2|

