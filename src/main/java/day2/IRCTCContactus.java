package day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCContactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
		driver.findElementByLinkText("Contact Us").click();
		
		//
		Set<String> allhand = driver.getWindowHandles();
	
		System.out.println(allhand.size());
		
		for (String eachwin : allhand) {
			
	    driver.switchTo().window(eachwin);
			
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		//driver.close();

	}

}
