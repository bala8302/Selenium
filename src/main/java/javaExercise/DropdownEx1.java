package javaExercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		Thread.sleep(3000);
		driver.findElementById("txtStationFrom").clear();
		 //driver.findElementById("txtStationFrom").sendKeys("MAS");
		 
		 
		 WebElement dd =  driver.findElementById("selectClassFilter");
		 
		 driver.findElementById("selectClassFilter").sendKeys("G");
				 
		 Select s = new Select(dd);
	
		 
	    //  s.selectByIndex(1);
		WebElement opt = s.getFirstSelectedOption();
		 
		String s1 = opt.getText();
	
		 //s.g
		 System.out.println(s1);
		 
		List<WebElement> dropdown = s.getOptions();
		
		int n = dropdown.size();
		
		
		for (WebElement eachopt : dropdown) {
			
			
		}
		
		
		

	}

}
