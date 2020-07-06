package MouseInteraction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.facebook.com");
		
		
		
		
		driver.manage().window().maximize();
		
		     WebElement we = driver.findElementById("email");
		     
		    String clr = driver.findElementById("email").getCssValue("color");
		    
		    System.out.println(clr);
		     
		     //we.ge
		     
		     Actions act = new Actions(driver);
		     
		     Action serisofaction = act
		    		 .moveToElement(we)
		    		 .click()
		             .keyDown(we,Keys.SHIFT)
		            // .keyUp(theKey)
		             .doubleClick(we)
		             .contextClick()
		             .build();
		     
		     serisofaction.perform();


	}

}
