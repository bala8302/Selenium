package javaExercise;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {
	public static WebDriver driver =  new ChromeDriver();;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		/*driver.get("http://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("bala8302");
		*///driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//waitingElement = driver.findElement(By.name("password"));
		//FluentWaitTest f = new FluentWaitTest();
		//f.fwait(waitingElement);

		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(60,TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		*/
		//wait.until(arg0)
		//WebElement waitingElement =  wait.until(new Function<WebDriver,WebElement>(){
			
				
		/*public WebElement apply(WebDriver driver)
		{
			return driver.findElement(By.id(""));
		}
	});*/
		
	}
	
	public void fwait(WebElement Ele)
	{

}
}
