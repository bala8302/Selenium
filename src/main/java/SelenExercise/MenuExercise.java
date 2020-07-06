package SelenExercise;

import static org.testng.Assert.expectThrows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("alert('test');");
		
		String title = js.executeScript("return document.title;").toString();
		
		js.executeScript("window.scrollBy(0,600)");
		
		driver.findElementByLinkText("Menu").click();
		
		WebDriverWait wait   = new WebDriverWait(driver, 30);
		 //WebElement ww = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Menu")));
	     wait.until(ExpectedConditions.alertIsPresent());
		
		//Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
		
		  //.withTimeout(30, TimeUnit.SECONDS)
		//  .pollingEvery(5, TimeUnit.SECONDS)
		
		//  .ignoring(Nosu)
		  
	    		
	    		
	    		
				
		
		driver.findElementByLinkText("Menu With Sub Menu").click();
		
		System.out.println("completed");
		
		WebElement ele = driver.findElementByXPath("(//li[@class='ui-corner-left']/a)[1]");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).perform();
		
		
		
		//WebElement ele1 = driver.findElementByLinkText("Sub Menu Item 1");
		
		WebElement  ele2 = driver.findElementByXPath("(//ul[@class='sub-level']/li)[1]");
		
		act.moveToElement(ele2);
		
		act.click();
		act.perform();
		
		System.out.println("completed1");
		

	}

}
