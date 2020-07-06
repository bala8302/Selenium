package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElementByName("otp").click(); 
		
		Thread.sleep(5000);
		String isChecked; 
		
		if (driver.findElementByName("otp").isSelected())
		{

			System.out.println("checked");
		}
		 
		 //isChecked = driver.findElementByName("otp").getAttribute("checked");
		 //System.out.print("ischeckedval"  +isChecked);
		//if(isChecked=="true")
		//{
		//	System.out.println("checked");
		//}
		else 
		{
			System.out.print("not checked");
		}
			
driver.find
	}

}
