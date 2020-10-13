package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class UniversalCreditPage extends BaseClass{
	
	public UniversalCreditPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Do you or your partner get paid Universal Credit?");
	}
	
	@FindBy(xpath="//label[@for='yes-universal']")
	private static WebElement yesuniversalcredit;
	
	public JointUniversalCreditPage selectUniversalCredit() {
		yesuniversalcredit.click();
		clickOnNextBtn();
		return new JointUniversalCreditPage();
	}
	
	

}
