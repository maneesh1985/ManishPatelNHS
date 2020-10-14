package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class YouOrFamilyHaveGlaucomaPage extends BaseClass {
	
	public YouOrFamilyHaveGlaucomaPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you or a family member have glaucoma?");
	}
	
	public CareHomePage selectDoYouOrFamilyGlaucomaAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new CareHomePage();
	}

}
