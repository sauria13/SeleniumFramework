package maven.selenium.demo.pageObjects;

import maven.selenium.demo.util.DriverFactory;
import maven.selenium.demo.util.WaitFluentFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


public class HomePageO {
	
	WebDriver driver;
	
	/**************** ALL ELEMENTS IN THE UPPER HEADER SECTION *******/
	
	@FindBy(how = How.ID, using = "q")
	private WebElement search;
	
	@FindBy(how = How.ID, using = "nav-search")
	private WebElement weatherUrCity;
	
	@FindBy(how = How.CLASS_NAME, using = "first-child")
	private WebElement emailUs;
	
	@FindBy(how = How.LINK_TEXT, using = "Sign In")
	private WebElement signin;
	
	@FindBy(how = How.LINK_TEXT, using = "Sign Up")
	private WebElement register;
	
	/*****************************************************************/
	
	/**************** ALL ELEMENTS IN THE HEADER SECTION *************/
	
	@FindBy(how = How.LINK_TEXT, using = "Weather in your city")
	private WebElement findWeatherCity;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")	
	private WebElement homeMenu;
	
	@FindBy(how = How.LINK_TEXT, using = "Weather")
	private WebElement weatherMenu;
	
	@FindBy(how = How.LINK_TEXT, using = "Maps")
	private WebElement mapsMenu;
	
	@FindBy(how = How.LINK_TEXT, using = "API")
	private WebElement apiMenu;
	
	@FindBy(how = How.LINK_TEXT, using = "Price")
	private WebElement priceMenu;
	
	@FindBy(how = How.LINK_TEXT, using = "Stations")
	private WebElement stationsMenu;
	
	@FindBy(how = How.LINK_TEXT, using = "News")
	private WebElement newsMenu;
	
	@FindBy(how = How.LINK_TEXT, using = "About")
	private WebElement aboutMenu;
	
	/*****************************************************************/
	
	/**************** ALL ELEMENTS IN THE FOOTER SECTION *************/
	
	@FindBy(how = How.LINK_TEXT, using = "Find your city")
	private WebElement findUrCity;
	
	@FindBy(how = How.LINK_TEXT, using = "Interactive weather maps")
	private WebElement interactiveWMaps;
	
	@FindBy(how = How.LINK_TEXT, using = "Interactive satellite image maps")
	private WebElement interactiveSIMaps;
	
	@FindBy(how = How.LINK_TEXT, using = "Examples of OpenWeatherMap weather map layers")
	private WebElement weatherMLayers;
	
	@FindBy(how = How.LINK_TEXT, using = "Embed weather maps with array of data")
	private WebElement embededWMData;
	
	@FindBy(how = How.LINK_TEXT, using = "Embed weather maps with tile server")
	private WebElement embededWTServer;
	
	@FindBy(how = How.LINK_TEXT, using = "How to connect your weather station")
	private WebElement howWStation;
	
	@FindBy(how = How.LINK_TEXT, using = "Network of weather stations in real time")
	private WebElement networkWSReal;
	
	@FindBy(how = How.LINK_TEXT, using = "OpenWeatherMap weather station prototype")
	private WebElement stationPrototype;
	
	@FindBy(how = How.LINK_TEXT, using = "DIY weather station projects")
	private WebElement dyiStationP;
	
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
	
	@FindBy(how = How.LINK_TEXT, using = "OpenWeatherMap technology")
	private WebElement openWMTech;
	
	@FindBy(how = How.LINK_TEXT, using = "Meteorological models")
	private WebElement meteoModels;
	
	@FindBy(how = How.LINK_TEXT, using = "Meteorological data sources")
	private WebElement meteoDataS;
	
	/**************************************************************************/
	
	/**************** ALL ELEMENTS IN THE FOOTER SECTION (SOCIAL) *************/
	
	@FindBy(how = How.LINK_TEXT, using = "Twitter")
	private WebElement twitter;
	
	@FindBy(how = How.LINK_TEXT, using = "Facebook")
	private WebElement facebook;
	
	@FindBy(how = How.LINK_TEXT, using = "Google+")
	private WebElement google;
	
	@FindBy(how = How.LINK_TEXT, using = "GitHub.")
	private WebElement github;
	
	/**************************************************************************/
	
	/**************** ALL ELEMENTS IN THE FOOTER SECTION (SUPPORT CENTER) *****/
	
	@FindBy(how = How.LINK_TEXT, using = "Support center")
	private WebElement supportCenter;
	
	/**************************************************************************/
	
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public HomePageO() {
			setDriver(DriverFactory.getDriver(2));
			PageFactory.initElements(getDriver(), this);
	}
	
	
	public void quitDriver(){
		driver.quit();
	}
	
	
	public void validateHeaderMenu( ){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(30, driver);
		
		/**************** ALL ELEMENTS IN THE HEADER SECTION *************/
		
		wait.until(ExpectedConditions.visibilityOf(homeMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(weatherMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(mapsMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(apiMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(priceMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(stationsMenu)).click();
		wait.until(ExpectedConditions.visibilityOf(newsMenu)).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOf(aboutMenu)).click();
	
		/******************************************************************/
		
	}
	
	public void validateFooterMenuWeatherinUrCity(){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(23, driver);
		
		/**************** ALL ELEMENTS IN WEATHER IN YOUR CITY *************/
		
		wait.until(ExpectedConditions.visibilityOf(findUrCity)).click();
		wait.until(ExpectedConditions.visibilityOf(interactiveWMaps)).click();
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOf(interactiveSIMaps)).click();
		driver.navigate().back();

		/******************************************************************/
		
	}
	
	
	public void validateFooterMenuMapLayers(){
			
		Wait<WebDriver> wait = WaitFluentFactory.getWait(23, driver);
		
		/**************** ALL ELEMENTS IN THE MAP LAYERS *************/
		
		wait.until(ExpectedConditions.visibilityOf(weatherMLayers)).click();
		
		wait.until(ExpectedConditions.visibilityOf(embededWMData)).click();
		
		wait.until(ExpectedConditions.visibilityOf(embededWTServer)).click();
		
		/******************************************************************/
	}
	
	public void validateFooterMenuWeatherStationNetwork(){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(23, driver);
		
		/**************** ALL ELEMENTS WEATHER STATION NETWORK *************/
		
		wait.until(ExpectedConditions.visibilityOf(howWStation)).click();
		
		wait.until(ExpectedConditions.visibilityOf(networkWSReal)).click();

		wait.until(ExpectedConditions.visibilityOf(stationPrototype)).click();
	
		wait.until(ExpectedConditions.visibilityOf(dyiStationP)).click();
		
		
		
		/******************************************************************/
	}
	
	
	public void validateFooterWorkAPI(){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(23, driver);
		
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
	
	public void validateFooterTechnologies(){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(25, driver);
		
		/**************** ALL ELEMENTS WEATHER STATION NETWORK *************/
		
		wait.until(ExpectedConditions.visibilityOf(openWMTech)).click();
		
		wait.until(ExpectedConditions.visibilityOf(meteoModels)).click();
		
		wait.until(ExpectedConditions.visibilityOf(meteoDataS)).click();
		
		/******************************************************************/
	}
	
	public void weatherInUrCity(String nameOfUrCity){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(13, driver);
		
		wait.until(ExpectedConditions.visibilityOf(weatherUrCity)).click();
		search.sendKeys(nameOfUrCity);
		wait.until(ExpectedConditions.visibilityOf(search)).submit();
		
	}
	
	
	public void signUp(String username, String usermail, String userpass){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(13, driver);
		
		SignUpO signUp = new SignUpO(driver);
			
		wait.until(ExpectedConditions.visibilityOf(register)).click();
		
		signUp.signUp(username, usermail, userpass);
		
	}
	
	public void signInWA(String usermail, String userpass){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(13, driver);
		
		SignInO signIn = new SignInO(driver);
			
		wait.until(ExpectedConditions.visibilityOf(signin)).click();
		
		signIn.signInApp(usermail, userpass);
		
	}
}
