package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTextField {

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
		 driver.findElementById("createLeadForm_companyName").sendKeys("CSC INDIA");
		
		 Thread.sleep(3000);
		 String prnttxt = driver.findElementById("createLeadForm_companyName").getAttribute("value");
		
		//String s = prnttxt.getText();
		 String s = prnttxt;
		
		System.out.print("printing"  +s);
		
		

	}

}
