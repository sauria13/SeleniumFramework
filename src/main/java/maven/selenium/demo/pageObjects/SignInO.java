package maven.selenium.demo.pageObjects;

import maven.selenium.demo.util.WaitFluentFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class SignInO {
	WebDriver driver;
	
/**************** ALL ELEMENTS IN THE SIGN IN SECTION *******/
	
	@FindBy(how = How.ID, using = "user_email")
	private WebElement userEmail;
	
	@FindBy(how = How.ID, using = "user_password")
	private WebElement userPass;
	
	@FindBy(how = How.ID, using = "user_remember_me")
	private WebElement userRemember;
	
	@FindBy(how = How.NAME, using = "commit")
	private WebElement createAccount;
	
	/*****************************************************************/
	
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public SignInO(WebDriver d) {
			setDriver(d);
			PageFactory.initElements(getDriver(), this);
	}
	
	
	public void quitDriver(){
		driver.quit();
	}
	
	
	public void signInApp(String usermail, String userpass){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(13, driver);
		
		/**************** ALL ELEMENTS WEATHER STATION NETWORK *************/
		
		wait.until(ExpectedConditions.visibilityOf(userEmail)).sendKeys(usermail);
		
		wait.until(ExpectedConditions.visibilityOf(userPass)).sendKeys(userpass);
		
		if(!userRemember.isSelected()){
			userRemember.click();
		}
		
		wait.until(ExpectedConditions.visibilityOf(createAccount)).submit();
		
		/******************************************************************/
	}
	
}
