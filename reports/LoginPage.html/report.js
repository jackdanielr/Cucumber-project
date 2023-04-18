$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/FeatureFile/LoginPage.feature");
formatter.feature({
  "name": "LoginPage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launch the facebook loginpage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the chrome browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Navigate to the login page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Validate the user landed in homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});