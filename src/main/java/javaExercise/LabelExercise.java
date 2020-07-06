package javaExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		

      List<WebElement> ws = driver.findElementsByTagName("label");
      
      
       int cnt = ws.size();
       
       int cntt=1;
       for(WebElement wd:ws)
       {
    	   if (cntt==5)
    	   {
    		   wd.click();
    	   }
    	   cntt++;
       }
       
      
     // driver.findElementsByCssSelector(using)      
  
      
      driver.findElementByName("first_name").sendKeys("test");
      JavascriptExecutor js = (JavascriptExecutor)driver;
      
      js.executeScript("document.getElementById('name_3_lastname').value='tddff'");
     
      js.executeScript("alert('msg box')"); 
      
      ArrayList<String> li = new ArrayList<String>();
      
    
      
      Iterator<WebElement> itr = ws.iterator();

       for(WebElement w: ws)
       {
    	System.out.println(w.getText()); 
    	
    	li.add(w.getText());
    	
    	
       }
  
       for(String l:li)
       {
    	   System.out.println(l);
       }

	}

}
