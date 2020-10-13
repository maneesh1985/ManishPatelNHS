package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CheckHelpPage extends BaseClass {
	
	public CheckHelpPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Check what help you could get to pay for NHS costs");
	}
	
	public CountryPage clickOnStart() {
		clickOnStartBtn();
		return new CountryPage(); 
	}

}
