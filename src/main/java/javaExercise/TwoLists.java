package javaExercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> li  = driver.findElementsByTagName("label");
		
		ArrayList<String> alis = new ArrayList<String>();
		
		LinkedList<String> ll = new LinkedList<String>();
		
		for(WebElement w: li)
		
		{
			alis.add(w.getText());
			alis.add("test");
		}
		
		ArrayList<String> alis1 = new ArrayList<String>();
		alis1.add("test");
		
		alis.retainAll(alis1);
		
		Set<String> allset = new HashSet<String>(alis);

		allset.retainAll(alis1);
		//allset.removeAll(alis1);
		//allset.retainAll(alis1);
		
		System.out.println(allset);		

	}

}
