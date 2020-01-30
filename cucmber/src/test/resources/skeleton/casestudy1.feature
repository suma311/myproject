Feature: register fearture
Scenario: registration for testme app
Given The URL of the test me app "http://10.232.237.143:443/TestMeApp/fetchcat.htm#"
When user clicks on SignUp button
And user enters "sri1" as username
And user enters "sri" as firstname
And user enters "sk" as lastname
And user enters "nani311" as password
And user enters "nani311" as confirmpassword
And user selects "femail" as gender
And user enters "b@gmail.com" as email
And user enters "9845372623" as mobileno
And user enters "07/11/1989" as dob
And user enters "vjghhujkvjh" as address
And user selects "What is Your Birth Place" as securityquestion
And user enters "Warangal" as Answer
And user clicks on register button
Then user on valid page