
package day2;

import static org.testng.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCDROPDOWN {

	public static void main(String[] args) {
		
		int i=0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement dcounty = driver.findElementById("userRegistrationForm:countries");
         
         Select dropdowncntry = new Select(dcounty);
         
         dropdowncntry.selectByIndex(1);
         dropdowncntry.selectByValue("test");
         dropdowncntry.selectByVisibleText("test");
         
		 List <WebElement> allopt = dropdowncntry.getOptions();
		
		for(WebElement eachoption : allopt)
		{
			if (eachoption.getText().equalsIgnoreCase(""))
			{
			
			eachoption.click();
			break;
		}
	}

    driver.quit();
}
}
	
