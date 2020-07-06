package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FBExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("bala8302@gmail.com");
		driver.findElementById("pass").sendKeys("Iamsuper10@");
		driver.findElementById("u_0_4").click();
		Thread.sleep(300);
		driver.findElementById("userNavigationLabel").click();
		//Thread.sleep(3000);
		 driver.findElementByXPath("/html/body/div[20]/div/div/div/div/div[1]/div/div/ul/li[12]/a/span/span").click();
		//driver.findElementByLinkText(using);
		
		
		
	}

}
