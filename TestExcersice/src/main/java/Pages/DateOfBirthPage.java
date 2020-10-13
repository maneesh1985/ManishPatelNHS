package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DateOfBirthPage extends BaseClass {
	
	public DateOfBirthPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("What is your date of birth?");
		
	}
	
	@FindBy(xpath="//input[@id='dob-day']")
	private static WebElement dayofthebirth;
	
	@FindBy(xpath="//input[@id='dob-month']")
	private static WebElement monthofthebirth;
	
	@FindBy(xpath="//input[@id='dob-year']")
	private static WebElement yearofthebirth;
	
	
	public PartnerPage enterDateOfBirth(String day, String month, String year) {
		dayofthebirth.sendKeys(day);
		monthofthebirth.sendKeys(month);
		yearofthebirth.sendKeys(year);
		clickOnNextBtn();
		return new PartnerPage();
	}
	
	public ResultPage enterDateOfBirthAsUnderSixteen(String day, String month, String year) {
		dayofthebirth.sendKeys(day);
		monthofthebirth.sendKeys(month);
		yearofthebirth.sendKeys(year);
		clickOnNextBtn();
		return new ResultPage();
	}

}
