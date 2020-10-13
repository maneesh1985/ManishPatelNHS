package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.BaseClass;

public class ResultPage extends BaseClass {
	
	public ResultPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".heading-xlarge done-panel,.heading-large")
	WebElement resulttitle;
	
	public void verifyResultPageMsg() {
		boolean msg =resulttitle.isDisplayed();
		Assert.assertTrue(msg);
	}
	
}
