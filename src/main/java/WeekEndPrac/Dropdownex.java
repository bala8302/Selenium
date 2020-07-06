package WeekEndPrac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownex {
	
	public static void main(String args[])
	{
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	ChromeDriver driver  = new ChromeDriver();
	
	 //driver.navigate().to("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	 driver.navigate().to("https://demoqa.com/selectmenu/");
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 
	 WebElement dd = driver.findElementById("speed");
	 
	 Select dropdown= new Select(dd);
	 dropdown.selectByVisibleText("Slow");
	 // three ways
	
	 
	 
	/* List<WebElement> allot  = dropdown.getOptions();
	 
	 //size
	 int totalcnt = allot.size();
	 //print the total count of elements
	 System.out.println(totalcnt);
	 
	 //selecting last index
	 
	 dropdown.selectByIndex(totalcnt-1);
	 
	 //selecting first one
	 
	 WebElement firstopt = dropdown.getFirstSelectedOption();
	 //get value of first option
	 String s = firstopt.getText();
	//store all values of dropdown in a list  
	 ArrayList<String> allis = new ArrayList<String>();
	 //
	 for(WebElement eachopt:allot)
	 {
		allis.add(eachopt.getText());
	 }
	 
	 //boolean flag = sortedorNot(allis);
	 
	 Dropdownex dv = new Dropdownex();
	 
	 boolean flag = dv.sortedorNot(allis);
	 
	 System.out.println("flaag="+flag);
		
	}
  
	 public  boolean sortedorNot(List<String> all)
	 {
		 for (int i=0;i<all.size();i++)
		 {
			 int temp = all.get(i).compareTo(all.get(i+1));
			 
			 if(temp>1)
			 {
				 System.out.println("i value"+i);
				 return false;
			 }
		 }
	
		 
		 return true;
		*/ 
	 }
	
	
}
