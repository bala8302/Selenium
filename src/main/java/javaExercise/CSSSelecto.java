package javaExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElementByCssSelector("input").sendKeys("ddd");
		
		driver.findElementByCssSelector("input[id^='name']").sendKeys("ggg");
		
		

	}

}
