Feature: Demo Web Shop Login feature file

  Scenario Outline: Valid Login for Demo Web Shop
    Given The URL of the Demo Web Shop "http://demowebshop.tricentis.com/login"
    When User enters "<username>" as username
    And User enters "<password>" as password
    And User clicks on Login button
    Then User is in a valid page

    Examples: 
      | username          | password |
      | askmail@gmail.com | abc123   |
      | askmail@email.com | abc123   |
      | askmail@ymail.com | abc123   |
