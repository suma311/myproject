Feature: Login feature

  Scenario Outline: Login for testme app
    Given the URL of the testme app "http://10.232.237.143:443/TestMeApp/fetchcat.htm#"
    When user clicks on SignIn button
    And user enters "<username>" as Username
    And user enters "<password>" as Password
    Then user clicks on Login button
    Examples: 
      | username | password |
      | sri1     | nani311  |
