package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CountryPage extends BaseClass {
	
	public CountryPage() {
		PageFactory.initElements(driver, this);
		verifyTitle("Which country do you live in?");
	}
	
	@FindBy(xpath="//label[@id='label-wales']")
	private static WebElement country;
	
	public DateOfBirthPage selectCountryAsWales() {
		
		country.click();
		clickOnNextBtn();
		return new DateOfBirthPage();
	}

}
