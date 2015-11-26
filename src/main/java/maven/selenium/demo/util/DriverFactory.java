package maven.selenium.demo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	public static WebDriver getDriver(int selector){
		
		WebDriver driver = null;
		String path = System.getProperty("user.dir"); // current path --> C:\Java\Selenium WebDriver\maven.selenium.demo\src\test\resources\
		
		
		switch(selector){
		case 1: driver = new FirefoxDriver();
		   		   break;
		case 2: {
				System.setProperty("webdriver.ie.driver", path + "/src/test/resources/IEDriverServer32.exe");
				driver = new InternetExplorerDriver();
				break;
				}
		default: driver = new HtmlUnitDriver();
							((HtmlUnitDriver) driver).setJavascriptEnabled(true);;
		}
		driver.get("http://openweathermap.org/");
		return driver;
	}
}	
