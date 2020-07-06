/*package javaExercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectableAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/menu/");
		
		driver.manage().window().maximize();

		 driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		 WebElement we = driver.findElementByXPath("//div[text()='Electronics']");
		 
		 we.click();
		 
		//Initiate mouse action using Actions class
			Actions builder = new Actions(driver);    

			
			// wait for max of 5 seconds before proceeding. This allows sub menu appears properly before trying to click on it
			WebDriverWait wait = new WebDriverWait(driver, 5); 
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Car Hifi']")));  // until this submenu is found
			
			
		//	ExpectedConditions.

			
			WebElement menuOption = driver.findElement(By.xpath("//div[text()='Car Hifi']"));
			menuOption.click();
			
			
		 //Prepare list of selectable Items
      //  List<WebElement> selectableItems = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']"));
        
     //   System.out.println(selectableItems.get(0).getText());
        
      //Build the select Item action.
           Actions toSelect = new Actions(driver);
        
     //   toSelect.clickAndHold(selectableItems.get(0)).click();
           
          // toSelect.se
        
        
        
        
        
      //Perform action.
       // Action selectItems = toSelect.build();
       // selectItems.perform();
			
			
			DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();    
					handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
					WebDriver driver1 = new ChromeDriver (handlSSLErr);

					
				//	 DataTableObject dataTableObject = new DataTableObject();


		

	}

}
*/