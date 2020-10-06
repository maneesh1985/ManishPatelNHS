package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class GlaucomaPage extends BaseClass {
	
	public GlaucomaPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you have glaucoma?");
	}
	
	public CareHomePage selectGlaucomaAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new CareHomePage();
	}

}
