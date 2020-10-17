package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import TestListeners.WebEventListener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBaseClass {
	
	public static WebDriver driver;
	public static Properties properties;
	public static String browser;
	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;
	
public NewBaseClass() {
		
		try {
			properties = new Properties();
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\NHS.properties");
			properties.load(inputStream);
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browsername) {
		
		MutableCapabilities cap = new MutableCapabilities();
		//cap.setCapability("name", methodname);
		cap.setCapability("build", "Java-W3C-Examples");
		cap.setCapability("seleniumVersion", "3.141.59");
		cap.setCapability("username", "maneeshpatel");
		cap.setCapability("accesKey", "f205acdf-6c07-4232-a3f6-ab7c5a6fd814");
		cap.setCapability("tags", "w3c-chrome-tests");
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("sauce:options", cap);
		desiredCapabilities.setCapability("browserVersion", "latest");
		desiredCapabilities.setCapability("platformname", "windows 10");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			desiredCapabilities.setCapability("browserName", "chrome");
			}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			desiredCapabilities.setCapability("browserName", "firefox");
		}
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		//https://maneeshpatel:f205acdf-6c07-4232-a3f6-ab7c5a6fd814@ondemand.eu-central-1.saucelabs.com:443/wd/hub
		try {
			driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
