package maven.selenium.demo.test;

import maven.selenium.demo.pageObjects.HomePageO;
import maven.selenium.demo.util.FailTestLogger;
import maven.selenium.demo.util.JUnitOrder;
import maven.selenium.demo.util.Order;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitOrder.class)
public class WeatherInUrCityTest {
	
	HomePageO homePage = new HomePageO();
	
/************ Test Suite Weather in your city  ******************/
	
	@Rule
	public FailTestLogger log = new FailTestLogger(homePage.getDriver());
	
	@Test
	@Order(order=1)
	public void WeatherInUrCity(){
		
		/*************SCRIPT 1*************/
		
			homePage.weatherInUrCity("Guadalajara");
			Assert.assertTrue(homePage.getDriver().getCurrentUrl().contains("Guadalajara"));
			
	}
	
	@Test
	@Order(order=2)
	public void WeatherInUrCity2(){
		
		/*************SCRIPT 2*************/
		
			homePage.weatherInUrCity("Monterrey");
			Assert.assertTrue(homePage.getDriver().getCurrentUrl().contains("Monterrey"));
			
	}
}
