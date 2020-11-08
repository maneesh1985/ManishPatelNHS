package StepDefinitions;

import Base.BaseClass;
import Pages.CheckHelpPage;
import Pages.CountryPage;
import Pages.DateOfBirthPage;
import Pages.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CostCheckerEndtoEndJourney extends BaseClass {
	
	public CostCheckerEndtoEndJourney() {
		super();
	}

	@Given("^User navigate to NHS Costs checker tool$")
	public void user_navigate_to_NHS_Costs_checker_tool()  {
		 setup();
		CheckHelpPage checkHelpPage = new CheckHelpPage();
		checkHelpPage.clickOnStartBtn();
	}

	@Given("^User is from Wales$")
	public void user_is_from_Wales()  {
		CountryPage countryPage = new CountryPage();
		countryPage.selectCountryAsWales();
	}

	@When("^User enters circumstances into the Checker tool as YES$")
	public void user_enters_circumstances_into_the_Checker_tool_as_YES()  {
		DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
		dateOfBirthPage.enterDateOfBirth(properties.getProperty("Day"), properties.getProperty("Month"), properties.getProperty("Year"))
		.selectPartnerAsYes()
		.selectBenifitOrTaxCreditAsYes()
		.selectUniversalCredit()
		.selectJointUniversalCredit()
		.selectTakeHomePay();
	}
	
	@When("^User enters circumstances into the Checker tool as NO$")
	public void user_enters_circumstances_into_the_Checker_tool_as_NO()  {
		DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
		dateOfBirthPage.enterDateOfBirth(properties.getProperty("Day"), properties.getProperty("Month"), properties.getProperty("Year"))
		.selectPartnerAsNo()
		.selectBenifitsOrTaxCreditAsNo()
		.selectGivenBirthAsNo()
		.selectInjuryOrIllnessAsNo()
		.selectDiabetesAsNo()
		.selectDoYouOrFamilyGlaucomaAsNo()
		.selectCareHomeAsNo()
		.selectInvestmentOrPropertyAsNo();
	}

	@When("^User enters circumstances into the Checker tool as aged under sixteen$")
	public void user_enters_circumstances_into_the_Checker_tool_as_aged_under_sixteen() {
		DateOfBirthPage dateOfBirthPage = new DateOfBirthPage();
		dateOfBirthPage.enterDateOfBirthAsUnderSixteen(properties.getProperty("Day"), properties.getProperty("Month"), properties.getProperty("Year_16"));
	   }


	@Then("^User get a result of whether User will get help or not$")
	public void user_get_a_result_of_whether_User_will_get_help_or_not()  {
		ResultPage resultPage = new ResultPage();
		resultPage.verifyResultPageMsg();
		driver.quit();
	}

	
	
	
	
}
