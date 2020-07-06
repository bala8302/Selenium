package MouseInteraction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateExercise {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("hp-widget__depart").click();
			List<WebElement> monthlist = driver.findElementsByXPath("//span[@class='ui-datepicker-month']");

		
		List<WebElement> table = null;
		
		
	  table = driver.findElementsByXPath("("//table[@class='ui-datepicker-calendar']//tbody")[1])");
		
		
		for(WebElement w: monthlist)
		{
			if (w.getText().equalsIgnoreCase("october"))
			{
				//table = driver.findElementsByXPath(using)
			}
		}
		
	}
}
