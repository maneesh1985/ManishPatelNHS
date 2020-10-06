package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class InjuryOrIllnessPage extends BaseClass {
	
	public InjuryOrIllnessPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you have an injury or illness caused by serving in the armed forces?");
	}
	
	public DiabetesPage selectInjuryOrIllnessAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new DiabetesPage();
	}

}
