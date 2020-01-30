Feature: payment gateway
Scenario: payment is done
Given the testme app url "http://10.232.237.143:443/TestMeApp/fetchcat.htm#"
 When user clicks on signIn button
    And user enters "sri1" as UserName
    And user enters "nani311" as PassWord
    And user clicks on login button
    And user search for product
    And user clicks on finddetails
     And user clicks on proceedtopay
    Then user doesnot seen the cart icon
    
     