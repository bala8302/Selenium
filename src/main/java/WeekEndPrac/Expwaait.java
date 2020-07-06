/*package WeekEndPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Expwaait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://demoqa.com/registration/");
		
		Thread.sleep(30);
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		wait.until(ExpectedConditions.urlContains("http://demo qa.com/registration/"));
		
		//wait.until(arg0)
		
		//wait.until(ExpectedConditions.
		
		

	}

}
*/