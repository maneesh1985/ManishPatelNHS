package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DoYouClaimBenifitOrTaxCreditPage extends BaseClass {
	
	public DoYouClaimBenifitOrTaxCreditPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you claim any benefits or tax credits?");
	}
	
	public GivenBirthPage selectBenifitsOrTaxCreditAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new GivenBirthPage();
	}

}
