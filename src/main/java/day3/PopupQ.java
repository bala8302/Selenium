package day3;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopupQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.popuptest.com/");

		driver.findElementByLinkText("Multi-PopUp Test").click();
		
		//driver.switchTo()

		Set<String> allhand = driver.getWindowHandles();

		System.out.println(allhand.size());

		for (String eachwin : allhand) {

			driver.switchTo().window(eachwin);

			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());


		}

	}
	
}


