package day3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		
		Thread.sleep(3000);
		//List<WebElement> iframes =  driver.findElementsByXPath("//iframe[@frameborder='0']");
		List<WebElement> iframes =  driver.findElementsByTagName("iframe");
		
		System.out.println("Total No of frames " +iframes.size());
		
		int framecnt;
		framecnt = iframes.size();
		
		for (int j =0; j < framecnt;j++)
		{
			driver.switchTo().frame(j);
			List<WebElement> alliframes =  driver.findElementsByTagName("iframe");
			
			k = alliframes.size();
			
			var = var+k;0
			driver.switchTo().parentFrame();
			
		}
		framecnt =+ var;
		System.out.println("Total No of frames including " +framecnt);
			}
	}
