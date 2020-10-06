package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;


public class GivenBirthPage extends BaseClass {
	
	public GivenBirthPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Are you pregnant or have you given birth in the last 12 months?");
	}
	
	public InjuryOrIllnessPage selectGivenBirthAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new InjuryOrIllnessPage(); 
		
	}

}
