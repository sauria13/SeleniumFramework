package maven.selenium.demo.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitFluentFactory {
	
	public static Wait<WebDriver> getWait(int timeunit, WebDriver d){
		Wait<WebDriver> wait = new FluentWait<WebDriver>(d)
			   	.withTimeout(timeunit, TimeUnit.SECONDS)
			   	.pollingEvery(500, TimeUnit.MILLISECONDS)
			   	.ignoring(NoSuchElementException.class)
			   	.ignoring(StaleElementReferenceException.class)
				.withMessage("One of your references does not longer exist! :( ");
		return wait;
	}
	
}
