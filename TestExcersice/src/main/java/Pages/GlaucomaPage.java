package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class GlaucomaPage extends BaseClass {
	
	public GlaucomaPage() {
		PageFactory.initElements(driver, this);
		verifyPageSource();
	}
	
	public CareHomePage selectGlaucomaAsNo() {
		clickOnNoRadioBtn();
		clickOnNextBtn();
		return new CareHomePage();
	}

}
