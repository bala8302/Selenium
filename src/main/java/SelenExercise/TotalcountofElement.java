
package SelenExercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.testng.Assert;

public class TotalcountofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://facebook.com");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		String bodyText = driver.findElement(By.tagName("body")).getText();
		//Assert.assertTrue("Text not found!", bodyText.contains("test"));
		
		System.out.println(bodyText);
	
		if (driver.getPageSource().contains(" Assert.assertTrue(Iselementpresent);
		
	/*	List<WebElement> ele  = driver.findElementsByTagName("a");
		
		System.out.println(ele.size());
		
		List<WebElement> ele1  = driver.findElementsByTagName("select");
		
		System.out.println(ele1.size());

		List<WebElement> ele2  = driver.findElementsByXPath("//input[@typFace"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	        boolean b = driver.getPageSource().contains("zzz");
	      
	    //    Assert.assertTrue(b);
	        
	    	System.out.println("boole"+b);
		//driver.getTouch();
		
		List<WebElement> xpath= driver.findElementsByXPath("//div[matches(@type,'che.*boxes')]");
		
		System.out.println("xpath" + xpath);
		
		
	  //e = 'checkbox']");
		
		System.out.println(ele2.size());
		
		List<WebElement> ele3  = driver.findElementsByTagName("//input[@class = 'inputtext']");
		
		System.out.println(ele3.size());*/
	}
}
