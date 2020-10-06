package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class JointUniversalCreditPage extends BaseClass {
	
	public JointUniversalCreditPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("As part of your joint Universal Credit, do you have any of these?");
	}
	
	public TakeHomePayPage selectJointUniversalCredit() {
		clickOnYesRadioBtn();
		clickOnNextBtn();
		return new TakeHomePayPage();
		
	}

}
