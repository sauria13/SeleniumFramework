package maven.selenium.demo.test;

import maven.selenium.demo.util.DriverFactory;
import maven.selenium.demo.util.WaitFluentFactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class DebugTest {
	
	WebDriver driver;
	
	
	/***************** WEB ELEMENTS*********************/
	
	@FindBy(how = How.LINK_TEXT, using = "Weather API for developers")
	private WebElement apiForDevelop;
	
	@FindBy(how = How.LINK_TEXT, using = "Current weather")
	private WebElement currentW;
	
	@FindBy(how = How.LINK_TEXT, using = "5 day / 3 hour weather forecast")
	private WebElement wForecast;
	
	@FindBy(how = How.LINK_TEXT, using = "16 day / daily weather forecast")
	private WebElement dailyForecast;
	
	@FindBy(how = How.LINK_TEXT, using = "Hourly historical data")
	private WebElement hourlyHData;
	
	@FindBy(how = How.LINK_TEXT, using = "Data from weather stations")
	private WebElement dataWStations;
	
	@FindBy(how = How.LINK_TEXT, using = "How to work with API key")
	private WebElement workAPIKey;
	
	@FindBy(how = How.LINK_TEXT, using = "Examples of API use")
	private WebElement examplesAPIuse;
	
	@FindBy(how = How.LINK_TEXT, using = "Price of service and support")
	private WebElement priceSSupport;
	
	/**************************************************************************/
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public DebugTest() {
		setDriver(DriverFactory.getDriver(2));
		PageFactory.initElements(getDriver(), this);
	}

public void validateFooterWorkAPI(){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(30, driver);
		
		/**************** ALL ELEMENTS WEATHER STATION NETWORK *************/
		
		wait.until(ExpectedConditions.visibilityOf(apiForDevelop)).click();
		
		wait.until(ExpectedConditions.visibilityOf(currentW)).click();
		
		wait.until(ExpectedConditions.visibilityOf(wForecast)).click();
		
		wait.until(ExpectedConditions.visibilityOf(dailyForecast)).click();
		
		wait.until(ExpectedConditions.visibilityOf(hourlyHData)).click();
		
		wait.until(ExpectedConditions.visibilityOf(dataWStations)).click();
	
		wait.until(ExpectedConditions.visibilityOf(workAPIKey)).click();
		
		wait.until(ExpectedConditions.visibilityOf(examplesAPIuse)).click();
		
		wait.until(ExpectedConditions.visibilityOf(priceSSupport)).click();
		
		/******************************************************************/
	}


@Test
public void Test(){
	
	/*************Environment Validation*************/
	try{
		validateFooterWorkAPI();
	}finally{
		driver.quit();
	}
	
	
}
	
}
