$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/test.feature");
formatter.feature({
  "name": "Test Google!",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add 2 numbers and print",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Numbers 12 and 20",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.getNumbers(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we add the numbers",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefs.add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "we will get the result as 32",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs.verifyResult(int)"
});
formatter.result({
  "status": "passed"
});
});