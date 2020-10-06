package Pages;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class TakeHomePayPage extends BaseClass{
	
	public TakeHomePayPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period?");
	}
	
	public ResultPage selectTakeHomePay() {
		clickOnYesRadioBtn();
		clickOnNextBtn();
		return new ResultPage();
		
	}

}
