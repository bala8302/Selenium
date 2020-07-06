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
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebTable {

	private static final RemoteWebDriver allcols = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		// implicit wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// opening the url
		
		driver.navigate().to("https://erail.in"); 
		
		//driver.get("https://erail.in");
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS");
		
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		driver.findElementById("txtStationFrom").click();
		
		Thread.sleep(3000);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("NDLS");
		
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		driver.findElementById("txtStationTo").click();
		
		//driver.findElement(by.)
		
		
	WebElement table=	driver.findElementByXPath("//table[@class='DataTable TrainList']");
	
	//System.out.println(table);
	
	List<WebElement> allrows = table.findElements(By.tagName("tr"));
	
//	List<String> test;
//	Map<String,String> s= new LinkedHashMap<String,String>();
	
	List<ArrayList<String>> rowsData = new ArrayList<ArrayList<String>>();
	//getrowscount
	
	int rowcnt = allrows.size();
	int colcnt=0;
	for (int i=0;i<rowcnt;i++)
	{
		  List<WebElement> allcols = allrows.get(i).findElements(By.tagName("td"));
		  colcnt = allcols.size();
		  ArrayList<String> rowData = new ArrayList<String>();
		  
		  if(allcols.get(2).getText().toString().contains("MAS"))
			 // rowData.add(allcols.get(2).getText().toString());
		  //s.put(allcols.get(1).getText(),allcols.get(3).getText());
			  
			  //allcols.get(2).
			  
			 
			 
		  
		  System.out.println(allcols.get(0).getText()+allcols.get(1).getText()+ allcols.get(2).getText());
		  
		   // rowsData.add(rowData);
		  
		  
		 // System.out.println(allcols.get(2).getText());
			
	}
	
    System.out.println("rowcnt =" + rowcnt);
    System.out.println("colcnt =" + colcnt);

	//System.out.println(s.entrySet());
	//System.out.println(rowsData);
    
	}

}
