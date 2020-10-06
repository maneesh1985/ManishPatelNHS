package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CareHomePage extends BaseClass {
	public CareHomePage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you live permanently in a care home?");
	}
	
	public InvestmentOrPropertyPage selectCareHomeAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new InvestmentOrPropertyPage();
		
	}

}
