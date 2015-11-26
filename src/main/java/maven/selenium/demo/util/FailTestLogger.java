package maven.selenium.demo.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FailTestLogger extends TestWatcher{
	private static int pass = 0;
	private static int failed = 0;
	
	WebDriver driver;
	
	public FailTestLogger() {
		
	}
	
	public FailTestLogger(WebDriver d) {
		driver = d;
	}
	
	 @Override
	 	protected void succeeded(Description description) {
	 		System.out.println(++pass+ "_Assert Validation Passed: "+ description);
	 	}
	 
	 @Override
	    protected void failed(Throwable e, Description description) {
	      
	        
	        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

	        File scrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	        File destFile = getDestinationFile();
	        try {
	            FileUtils.copyFile(scrFile, destFile);
	        } catch (IOException ioe) {
	            throw new RuntimeException(ioe);
	        }
	        
	        System.out.println(++failed+ "_Wrong validation of a match Text on the screen: " + description);
	        System.out.println("For further information please refer to log file and review the screenshot...");
	        System.out.println("Screenshot path = "+destFile);
	    }
	 
	 @Override
	    protected void finished(Description description) {
	        driver.close();
	    }
	 
	 
	 private File getDestinationFile() {
	        String userDirectory = FileUtils.getTempDirectoryPath();
	        String fileName = "screenShot"+(++pass)+".png";
	        String absoluteFileName = userDirectory+"/SELENIUM_FWK_LOG" + "/" + fileName;

	        return new File(absoluteFileName);
	 }
}
