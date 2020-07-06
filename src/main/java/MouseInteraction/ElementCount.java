package MouseInteraction;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/control/main");
		
		//implicit wait

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		List<WebElement> ele = driver.findElements(By.tagName("Input"));
		
		//var alltextboxes = driver.findElements(By.tagName("Input"));
		
			
		
		//Iterator<WebElement> itr = ele.iterator();
		
		int ele1 = ele.size();
		
		for (WebElement iter : ele) {
			
			iter.sendKeys("test");
			//Select obj = new Select(iter);
			//iter.sendKeys(arg0);
			System.out.println(iter);
	}
		
		for (int i =0;i<ele1;i++)
		{
		  if (ele1 ==13)
		  {
			  //ele.s
			  
			  //ele1[i].
		  }
				  
		}
		
		//System.out.println(ele);
		//System.out.println(ele1);

	}

}
