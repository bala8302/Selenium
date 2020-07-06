package homeWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementByLinkText("/crmsfa/control/main?externalLoginKey=EL477076157803").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Apple");
		driver.findElementById("lastNameField").sendKeys("Phone");
		driver.findElementByName("submitButton").click();
		driver.close();
		
	}

}
