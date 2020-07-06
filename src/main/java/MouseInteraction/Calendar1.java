package MouseInteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.navigate().to("http://www.yatra.com/");
		
		driver.navigate().to("https://jqueryui.com/datepicker/");
		//driver.findElement(By.id("//div[2]/ul[3]/li[1]/i")).click();
		driver.manage().window().maximize();
		
		//driver.navigate().forward();
		//driver.findElementByXPath("//i[@class ='font-icon icon-inside icon-calendar blur_class'][1]").click();
		
		//driver.findElementByXPath("(//span[@class='day-num'])[20]").click();
		
		
        //driver.findElement(By.id("a_2015_4_25")).click();"
		
		Thread.sleep(9000);
		
		//driver.findElementById("datepicker").click();
		
		WebElement drag = driver.findElementByXPath("//input[@class='hasDatepicker']");
		 
		 Actions builder = new Actions(driver);
		 
		  builder.contextClick().perform();
		 
		  builder.contextClick(drag).perform();
		  builder.moveToElement(drag).perform();
			
		
	
	}

}
