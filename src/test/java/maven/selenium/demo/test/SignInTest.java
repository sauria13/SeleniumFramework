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
public class SignInTest {
	
	HomePageO homePage = new HomePageO();
	
	/************ Test Suite Weather in your city  ******************/
		
		@Rule
		public FailTestLogger log = new FailTestLogger(homePage.getDriver());
		
		@Test
		@Order(order=1)
		public void loginAccount(){
			
			/*************SCRIPT 1*************/
			
				homePage.signInWA("seleniumwd@outlook.com", "miprueba");
				Assert.assertTrue(homePage.getDriver().getCurrentUrl().equals("http://home.openweathermap.org/"));
				
		}
}
