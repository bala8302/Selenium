package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week1Day2 {

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
		driver.findElementById("createLeadForm_firstName").sendKeys("Balasubramani");
		driver.findElementById("createLeadForm_lastName").sendKeys("Thangaraj");
		
		WebElement dd= driver.findElementById("createLeadForm_dataSourceId");
		Select DropDown=new Select(dd);
		DropDown.selectByVisibleText("Conference");
		
		driver.findElementByName("submitButton").click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		//driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByXPath("//*[@id='logout']/input").click();
		
	}

}