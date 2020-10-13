$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NHScostcheck.feature");
formatter.feature({
  "line": 1,
  "name": "User from wales checks NHS cost",
  "description": "",
  "id": "user-from-wales-checks-nhs-cost",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 7549378800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User checks NHS cost providing circumstances as YES",
  "description": "",
  "id": "user-from-wales-checks-nhs-cost;user-checks-nhs-cost-providing-circumstances-as-yes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters circumstances into the Checker tool as YES",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User get a result of whether User will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_is_from_Wales()"
});
formatter.result({
  "duration": 439680900,
  "status": "passed"
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_enters_circumstances_into_the_Checker_tool_as_YES()"
});
formatter.result({
  "duration": 2834306600,
  "status": "passed"
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_get_a_result_of_whether_User_will_get_help_or_not()"
});
formatter.result({
  "duration": 737404100,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 6283234700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User checks NHS cost providing circumstances as NO",
  "description": "",
  "id": "user-from-wales-checks-nhs-cost;user-checks-nhs-cost-providing-circumstances-as-no",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User is from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User enters circumstances into the Checker tool as NO",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User get a result of whether User will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_is_from_Wales()"
});
formatter.result({
  "duration": 331340600,
  "status": "passed"
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_enters_circumstances_into_the_Checker_tool_as_NO()"
});
formatter.result({
  "duration": 1832774300,
  "error_message": "java.lang.AssertionError: expected [Do you have glaucoma?] but found [Do you or a family member have glaucoma?]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat Base.BaseClass.verifyTitle(BaseClass.java:126)\r\n\tat Pages.GlaucomaPage.\u003cinit\u003e(GlaucomaPage.java:11)\r\n\tat Pages.DiabetesPage.selectDiabetesAsNo(DiabetesPage.java:17)\r\n\tat StepDefinitions.CostCheckerEndtoEndJourney.user_enters_circumstances_into_the_Checker_tool_as_NO(CostCheckerEndtoEndJourney.java:51)\r\n\tat ✽.When User enters circumstances into the Checker tool as NO(NHScostcheck.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_get_a_result_of_whether_User_will_get_help_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigate to NHS Costs checker tool",
  "keyword": "Given "
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_navigate_to_NHS_Costs_checker_tool()"
});
formatter.result({
  "duration": 6321941100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User checks NHS cost as aged under sixteen",
  "description": "",
  "id": "user-from-wales-checks-nhs-cost;user-checks-nhs-cost-as-aged-under-sixteen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "User is from Wales",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User enters circumstances into the Checker tool as aged under sixteen",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User get a result of whether User will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_is_from_Wales()"
});
formatter.result({
  "duration": 405996500,
  "status": "passed"
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_enters_circumstances_into_the_Checker_tool_as_aged_under_sixteen()"
});
formatter.result({
  "duration": 710628600,
  "status": "passed"
});
formatter.match({
  "location": "CostCheckerEndtoEndJourney.user_get_a_result_of_whether_User_will_get_help_or_not()"
});
formatter.result({
  "duration": 721100000,
  "status": "passed"
});
});