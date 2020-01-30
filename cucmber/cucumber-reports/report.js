$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/shout.feature");
formatter.feature({
  "name": "Shout Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Persons are not in range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.step({
  "name": "Sean is 100 meters away from Lucia",
  "keyword": "Given "
});
formatter.match({
  "location": "skeleton.stepdefinition.sean_is_meters_away_from_Lucia(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sean shouts \"Free Coffee\"",
  "keyword": "When "
});
formatter.match({
  "location": "skeleton.stepdefinition.sean_shouts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lucia hears the  no message",
  "keyword": "Then "
});
formatter.match({
  "location": "skeleton.stepdefinition.lucia_hears_the_no_message()"
});
formatter.result({
  "status": "passed"
});
});