package day3;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Day1 {

	static int i=0,j=0;
	public static void main(String[] args) throws InterruptedException {
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
		
		
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		

        Thread.sleep(2000);
		
        driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();		
        
        Thread.sleep(2000);
        
        // Focus to tab 2
        
       Set<String> allhand = driver.getWindowHandles();
		
		System.out.println(allhand.size());
		
		for (String eachwin : allhand) {
			
	    driver.switchTo().window(eachwin);
			
		}

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
        driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10366");
        
        //driver.findElementByXPath("//*[@id='ext-gen25']").sendKeys("10358");
        
        Thread.sleep(2000);
        
        driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
        //driver.findElementByXPath("//*[@id='ext-gen114']").click();
      
      // //*[@id="ext-gen297"]
        
        Thread.sleep(8000);
        
        
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
        
        //driver.findElementByLinkText("27728").click();
		
        // Shifting to tab 1
		
       allhand = driver.getWindowHandles();
		
		//System.out.println(allhand.size());
		
		for (String eachwin : allhand) {
			
			i++;
			
			if (i==1) 
					{
				driver.switchTo().window(eachwin);
				break;
					}
			
			
		}
		System.out.println("window"+ i);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();		
        
        Thread.sleep(2000);
        
        // Focus back to tab 2 
        
        allhand = driver.getWindowHandles();
 		
 		System.out.println(allhand.size());
 		
 		for (String eachwin : allhand) {
 			
 	    driver.switchTo().window(eachwin);
 			
 		}

 		System.out.println(driver.getTitle());
 		System.out.println(driver.getCurrentUrl());
 		Thread.sleep(2000);
 		
         
 		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10360");
         //driver.findElementByXPath("//*[@id='ext-gen25']").sendKeys("10360");
         
         Thread.sleep(2000);
         
         driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
         //driver.findElementByXPath("//*[@id='ext-gen114']").click();
       
         
         Thread.sleep(8000);
         
          
         driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click(); 
         //driver.findElementByLinkText("26818").click();
         
      // Shifting to tab 1
 		
         allhand = driver.getWindowHandles();
  		
  		//System.out.println(allhand.size());
  		
  		for (String eachwin : allhand) {
  			
  			j++;
  			
  			if (j==1) 
  					{
  				driver.switchTo().window(eachwin);
  				break;
  					}
  			
  			
  		}
  		System.out.println(+ j);
  		System.out.println(driver.getTitle());
  		System.out.println(driver.getCurrentUrl());
  		
  		Thread.sleep(2000);
  		
         driver.findElementByLinkText("Merge").click();

        
         //  Handling Alert
         
         driver.switchTo().alert().accept();
         
         
         driver.findElementByLinkText("Find Leads").click();
         
         driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("909");
         
         driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
         
         String txt = driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
         
         System.out.println(txt);
         
	}

}
