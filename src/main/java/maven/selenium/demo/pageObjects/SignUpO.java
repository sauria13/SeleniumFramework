package maven.selenium.demo.pageObjects;

import maven.selenium.demo.util.WaitFluentFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class SignUpO {
	
WebDriver driver;
String successful;


	
	/**************** ALL ELEMENTS IN THE SIGN UP SECTION *******/
	
	@FindBy(how = How.ID, using = "user_username")
	private WebElement userName;
	
	@FindBy(how = How.ID, using = "user_email")
	private WebElement userEmail;
	
	@FindBy(how = How.ID, using = "user_password")
	private WebElement userPass;
	
	@FindBy(how = How.ID, using = "user_password_confirmation")
	private WebElement userPassCon;
	
	@FindBy(how = How.ID, using = "user_agreement")
	private WebElement userAgree;
	
	@FindBy(how = How.NAME, using = "commit")
	private WebElement createAccount;
	
	@FindBy(how = How.CLASS_NAME, using = "panel-body")
	private WebElement newAccount;
	
	/*****************************************************************/
	
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public SignUpO(WebDriver d) {
			setDriver(d);
			PageFactory.initElements(getDriver(), this);
	}
	
	
	public void setSuccessful(String successful) {
		this.successful = successful;
	}
	
	public void quitDriver(){
		driver.quit();
	}
	
	public void signUp(String username, String usermail, String userpass){
		
		Wait<WebDriver> wait = WaitFluentFactory.getWait(13, driver);
		
		/**************** ALL ELEMENTS WEATHER STATION NETWORK *************/
		
		wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(username);
		
		wait.until(ExpectedConditions.visibilityOf(userEmail)).sendKeys(usermail);
		
		wait.until(ExpectedConditions.visibilityOf(userPass)).sendKeys(userpass);
		
		wait.until(ExpectedConditions.visibilityOf(userPassCon)).sendKeys(userpass);
		
		if(!userAgree.isSelected()){
			userAgree.click();
		}
		
		wait.until(ExpectedConditions.visibilityOf(createAccount)).submit();
		
		/******************************************************************/
	}
	
	
}
