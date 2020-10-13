package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class BenifitOrTaxCreditPage extends BaseClass {
	
	public BenifitOrTaxCreditPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you or your partner claim any benefits or tax credits?");
		
	}
	
	public UniversalCreditPage selectBenifitOrTaxCreditAsYes() {
		clickOnYesRadioBtn();
		clickOnNextBtn();
		return new UniversalCreditPage();
	}

}
