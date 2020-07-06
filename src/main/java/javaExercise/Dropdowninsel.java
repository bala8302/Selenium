package javaExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowninsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
		
        driver.findElementById("userRegistrationForm:userName").sendKeys("testumesh");
        driver.findElementById("userRegistrationForm:password").sendKeys("testpwd");
        driver.findElementById("userRegistrationForm:confpasword").sendKeys("testpwd");
        
        WebElement dcounty = driver.findElementById("userRegistrationForm:countries");
        
        Select dropdowncntry = new Select(dcounty);
        //dropdowncntry.se

	}

}
