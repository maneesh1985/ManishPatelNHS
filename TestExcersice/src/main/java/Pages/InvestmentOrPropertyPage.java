package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class InvestmentOrPropertyPage extends BaseClass {
	
	public InvestmentOrPropertyPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you have more than £16,000 in savings, investments or property?");
	}
	
	public ResultPage selectInvestmentOrPropertyAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new ResultPage();
	}

}
