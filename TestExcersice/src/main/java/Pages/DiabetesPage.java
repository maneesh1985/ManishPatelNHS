package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DiabetesPage extends BaseClass {
	
	public DiabetesPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you have diabetes?");
	}
	
	public YouOrFamilyHaveGlaucomaPage selectDiabetesAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new YouOrFamilyHaveGlaucomaPage();
	}

}
