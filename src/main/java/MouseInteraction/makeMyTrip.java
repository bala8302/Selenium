package MouseInteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class makeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
	
		
		int day=23;
		String month="June";
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElementById("hp-widget__depart").click();
		
		driver.findElementByLinkText("Next").click();
		System.out.println("nextclicked");
		
		for (int i=0;i<12;i++)
		{
			driver.findElementByLinkText("Next").click();
			if(month.equalsIgnoreCase(driver.findElementByXPath("(//span[@class='ui-datepicker-month'])[1]").getText()))
			{
				System.out.println(driver.findElementByXPath("(//span[@class='ui-datepicker-month'])[1]").getText());
				break;
				
			}
		}
		
		//driver.switchTo().alert().dismiss();
		
		System.out.println("alertdismissed");
		
		WebElement table=null;
		int n=1;
		//table=driver.findElementByXPath("(//table[@class='ui-datepicker-calendar']//tbody)[2]");			

		if(month.equalsIgnoreCase(driver.findElementByXPath("(//span[@class='ui-datepicker-month'])[1]").getText())){
			table=driver.findElementByXPath("(//table[@class='ui-datepicker-calendar']//tbody)["+n+"]");
			System.out.println("May");
		}else if(month.equalsIgnoreCase(driver.findElementByXPath("(//span[@class='ui-datepicker-month'])[2]").getText())){
			table=driver.findElementByXPath("(//table[@class='ui-datepicker-calendar']//tbody)["+(n+1)+"]");			
		System.out.println("Not May");
		System.out.println(table.toString());
		}else{
			System.out.println(driver.findElementByXPath("(//span[@class='ui-datepicker-month'])[2]").getText());
			System.out.println("Enter month "+month+"must be current or the preceeding month");
		}
		
		
		List<WebElement> allRow=table.findElements(By.tagName("tr"));
		
		for (int i = 0; i <allRow.size(); i++) {
			List<WebElement> alcolumn=allRow.get(i).findElements(By.tagName("td"));
			for(int j=0;j<alcolumn.size();j++){
			if((alcolumn.get(j).getText().equals(" "))||(Integer.parseInt(alcolumn.get(j).getText())!=day)){
				//System.out.println("in If");
				continue;
			}else{
				alcolumn.get(j).click();
				System.out.println("Day "+day+" is clicked");
				break;
			}
			}
			//System.out.println(alcolumn.get(i).getText());
		}
	}

}
