package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class PartnerPage extends BaseClass {
	
	public PartnerPage() {
		PageFactory.initElements(driver	, this);
		verifyTitle("Do you live with a partner?");
	}
	
	public BenifitOrTaxCreditPage selectPartnerAsYes() {
		clickOnYesRadioBtn();
		clickOnNextBtn();
		return new BenifitOrTaxCreditPage();
	}
	
	public DoYouClaimBenifitOrTaxCreditPage selectPartnerAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new DoYouClaimBenifitOrTaxCreditPage();
	}

}
