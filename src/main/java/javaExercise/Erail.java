package javaExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\Downloads\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		Thread.sleep(3000);
		//driver.findElementById("txtStationFrom").clear();
		//driver.findElementById("txtStationFrom").sendKeys("MAS");
		
		
		
		/*driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		driver.findElementById("txtStationFrom").click();
		
		Thread.sleep(3000);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NDLS");
		
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		driver.findElementById("txtStationTo").click();
		*///
		
		driver.findElementById("buttonFromTo").click();
		
		
		WebElement table =	driver.findElementByXPath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']");
	  
	    List<WebElement> allrows = table.findElements(By.tagName("tr"));
	    
	    int rowsize = allrows.size();
	    
	    System.out.println("rowsize="+rowsize);
	    
	     WebElement firstrow = allrows.get(0);
	     
	    
	     List<WebElement> allcols = firstrow.findElements(By.tagName("td"));
	    	int colsize = allcols.size();
	    System.out.println("colsize="+colsize);
	    
	    //ArrayList<String> al =new ArrayList<String>();
	    Map<String,String> s = new LinkedHashMap<String,String>();
	    
	    for (int i=0;i<rowsize-1;i++)
	    	
	    {
	    	
	    	s.put(allcols.get(1).getText(), allcols.get(3).getText());	    	    	    	
	    }
	    
	    System.out.println(s.entrySet());	    
	    
	}

}
