Feature: Shout Feature
Scenario: Persons are within range
Given Sean is 10 meters away from Lucia
When Sean shouts "Free Coffee"
Then Lucia hears the message "Free Coffee"
@invalid
Scenario: Persons are not in range
Given  Sean is 100 meters away from Lucia
When Sean shouts "Free Coffee"
Then Lucia hears the  no message
