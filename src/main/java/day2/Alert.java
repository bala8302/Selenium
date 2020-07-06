package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
		//Entering to the frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		driver.switchTo().alert().sendKeys("balasubramani");
		driver.switchTo().alert().accept();
		String s = driver.findElementById(" demo").getText();
		
		System.out.print(s.contains("bala"));
		
		
		driver.switchTo().defaultContent();
	}

}
