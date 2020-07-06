package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
		
        driver.findElementById("userRegistrationForm:userName").sendKeys("testumesh");
        driver.findElementById("userRegistrationForm:password").sendKeys("testpwd");
        driver.findElementById("userRegistrationForm:confpasword").sendKeys("testpwd");
        
         WebElement dd = driver.findElementById("userRegistrationForm:securityQ");
         Select dropdown = new Select(dd);
         dropdown.selectByVisibleText("What is your all time favorite sports team?");
         
       
         
         
         driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("cricket");
         driver.findElementById("userRegistrationForm:firstName").sendKeys("Balasubramani");
         driver.findElementById("userRegistrationForm:lastName").sendKeys("Thangaraj");
         driver.findElementById("userRegistrationForm:gender:0").click();
         driver.findElementById("userRegistrationForm:maritalStatus:0").click();
         
         WebElement datd = driver.findElementById("userRegistrationForm:dobDay");
         //Select dropdown1 = new Select(datd);
         datd.sendKeys("10");
         //datd.sendKeys(Keys.TAB);
         WebElement datm = driver.findElementById("userRegistrationForm:dobMonth");
         datm.sendKeys("SEP");
         WebElement daty = driver.findElementById("userRegistrationForm:dateOfBirth");
         daty.sendKeys("1984");
         //Choosing Occupation
         WebElement docc = driver.findElementById("userRegistrationForm:occupation");
         docc.sendKeys("Professional");
         
         driver.findElementById("userRegistrationForm:email").sendKeys("bala8302@gmail.com");
         driver.findElementById("userRegistrationForm:mobile").sendKeys("9840392439");
         //Nationality
         WebElement dnationl = driver.findElementById("userRegistrationForm:nationalityId");
         Select dropdownnat = new Select(dnationl);
         dropdownnat.selectByValue("94");
         
         //Address
         
         driver.findElementById("userRegistrationForm:address").sendKeys("block no 1c,flat 5");
         
         WebElement dcounty = driver.findElementById("userRegistrationForm:countries");
         
         Select dropdowncntry = new Select(dcounty);
         dropdowncntry.selectByValue("94");
         
         driver.findElementById("userRegistrationForm:pincode").sendKeys("600036");
         driver.findElementById("userRegistrationForm:statesName").click();
         
         Thread.sleep(3000);
         driver.findElementById("userRegistrationForm:cityName").click();
         WebElement dcit1 = driver.findElementById("userRegistrationForm:cityName");
         //Select dropcit = new Select(dcit);
         //List<WebElement> alloptions = dropcit.getOptions();
         
         //dropcit.selectByIndex(alloptions.size());
         //dropcit.selectByValue("-1");
         dcit1.sendKeys("Chennai");
        
         driver.findElementById("userRegistrationForm:postofficeName").click();
         Thread.sleep(5000);
         //driver.findElementById("userRegistrationForm:postofficeName").click();
         WebElement dpost1 = driver.findElementById("userRegistrationForm:postofficeName");
         Select droppost = new Select(dpost1);
         droppost.selectByVisibleText("Indian Institute Of Technology S.O");
         //dpost1.sendKeys("Indian Institute Of Technology S.O");
         
         driver.findElementById("userRegistrationForm:landline").sendKeys("0443409898");
         
	}

}
