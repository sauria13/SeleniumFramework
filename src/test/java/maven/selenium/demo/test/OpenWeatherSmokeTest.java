package maven.selenium.demo.test;

import maven.selenium.demo.pageObjects.HomePageO;
import maven.selenium.demo.util.JUnitOrder;
import maven.selenium.demo.util.Order;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitOrder.class)
public class OpenWeatherSmokeTest{
	
	/************ TEST SCRIPT ENVIRONMENT VALIDATION ******************/
	
	@Test
	@Order(order=1)
	public void OpenWeatherValidateHeaderMenus(){

		HomePageO homePage = new HomePageO();
		
		/*************Environment Validation*************/
		try{
			homePage.validateHeaderMenu();
		}finally{
			homePage.quitDriver();
		}
			
	}
	
	
	@Test
	@Order(order=2)
	public void OpenWeatherValidateFooterMenuYourCity(){

		HomePageO homePage = new HomePageO();
		
		/*************Environment Validation*************/
		try{
			homePage.validateFooterMenuWeatherinUrCity();
		}finally{
			homePage.quitDriver();
		}
			
	}
	
	@Test
	@Order(order=3)
	public void OpenWeatherValidateFooterMenuMapLayer(){

		HomePageO homePage = new HomePageO();
		
		/*************Environment Validation*************/
		try{
			homePage.validateFooterMenuMapLayers();
		}finally{
			homePage.quitDriver();
		}
			
	}
	
	@Test
	@Order(order=4)
	public void OpenWeatherValidateFooterMenuStationNetwork(){

		HomePageO homePage = new HomePageO();
		
		/*************Environment Validation*************/
		try{
			homePage.validateFooterMenuWeatherStationNetwork();
		}finally{
			homePage.quitDriver();
		}
			
	}
	
	
	@Test
	@Order(order=5)
	public void OpenWeatherValidateFooterMenuWorkAPI(){

		HomePageO homePage = new HomePageO();
		
		/*************Environment Validation*************/
		try{
			homePage.validateFooterWorkAPI();
		}finally{
			homePage.quitDriver();
		}
			
	}
	
	
	@Test
	@Order(order=6)
	public void OpenWeatherValidateFooterMenuTechnologies(){

		HomePageO homePage = new HomePageO();
		
		/*************Environment Validation*************/
		try{
			homePage.validateFooterTechnologies();
		}finally{
			homePage.quitDriver();
		}
			
	}
	
}
