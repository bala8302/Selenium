package wrappers;

import java.io.File;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporter;

public class GenericWrappers extends Reporter implements Wrappers{

	RemoteWebDriver driver;
	
	
	
	int i =1;


	public void invokeApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
			 
			//takeSnap();
			//System.out.println("The browser:" + browser + " launched successfully");
			reportStep("The browser:" + browser + " launched successfully", "PASS");
		}catch (WebDriverException e) {
			//System.err.println("The browser might have closed or not launched");
			reportStep("The browser might have closed or not launched", "FAIL");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			//System.err.println("Unknow exception occurred, please debug the issue");
			reportStep("Unknown exception occurred, please debug the issue", "FAIL");
			throw new RuntimeException("Unknow exception occurred, please debug the issue");
		}
		finally {
			takeSnap();
		}

	}


	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			//takeSnap();
			//System.out.println("The data: "+data+" entered successfully in field :"+idValue);
			reportStep("The data: "+data+" entered successfully in field :"+idValue+"","PASS");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException: ELement "+idValue+" is not found","FAIL");
			//System.err.println("NoSuchElementException: ELement "+idValue+" is not found");
			throw new RuntimeException("NoSuchElementException: ELementValueRTE "+idValue+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("Exception: From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("Exception: From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("Exception: From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}
		
	}


	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);
			reportStep("The data: "+data+" entered successfully in field :"+nameValue,"PASS");
			//System.out.println("The data: "+data+" entered successfully in field :"+nameValue);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException: ELement "+nameValue+" is not found", "FAIL");
			//System.err.println("NoSuchElementException: ELement "+nameValue+" is not found");
			throw new RuntimeException("NoSuchElementException: ELementValueRTE "+nameValue+" is not found");
		} catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("Exception:From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("Exception:From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("Exception: From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}        
	}


	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub

		try {
			driver.findElementByXPath(xpathValue).clear();
			driver.findElementByXPath(xpathValue).sendKeys(data);
			reportStep("The data: "+data+" entered successfully in field :"+xpathValue,"PASS");
			//System.out.println("The data: "+data+" entered successfully in field :"+xpathValue);	
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException: ELement "+xpathValue+" is not found","FAIL");
			//System.err.println("NoSuchElementException: ELement "+xpathValue+" is not found");
			throw new RuntimeException("NoSuchElementException: ELementValueRTE "+xpathValue+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException : driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException : driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException : window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("Exception: From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("Exception: From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("Exception: From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}
	}


	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String s=driver.getTitle();
			if(s.equals(title))
				System.out.println("Displayed Title "+ s +" matches with the Given: " +title);
			else
				System.out.println("Displayed Title"+ s+" did not match with the Given: " +title);
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}finally {
			takeSnap();
		}

		

	}


	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String s=driver.findElementById(id).getText();
			if(s.equalsIgnoreCase(text))
				System.out.println("The given text "+text + " is same  as : "+ s);
			else
				System.out.println("The given text "+text + " is NOT same as : "+ s);
		} catch (NoSuchElementException e) {
			System.err.println("The element "+id+" not found");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}finally {
			takeSnap();
		}
		

	}

	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String s=driver.findElementById(id).getText();
			if(s.contains(text))
				System.out.println("The given text contains "+text + " is same  as : "+ s);
			else
				System.out.println("The given text  "+text + " is NOT same as : "+ s);
		} catch (NoSuchElementException e) {
			System.err.println("The element "+id+" not found");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}finally {
			takeSnap();
		}
		

	}

	public void verifyTextByXpath(String xpath, String text) {
		try{
			String s=driver.findElementByXPath(xpath).getText();
			if(s.equals(text)){
				reportStep("The given text "+ s + " is same as "+text,"PASS");
				//System.out.println("The given text "+ s + " is same as "+text);
			}else{
				reportStep("The given text "+ s + " is NOT same as "+text,"FAIL");
				//System.out.println("The given text "+s + " is NOT same as "+text);
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException: ELement "+xpath+" is not found","FAIL");
			//System.err.println("NoSuchElementException: ELement "+xpath+" is not found");
			throw new RuntimeException("NoSuchElementException: ELementValue "+xpath+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}
		

	}


	public void verifyTextContainsByXpath(String xpath, String text) {
		try{
			String s=driver.findElementByXPath(xpath).getText();
			if(s.contains(text)){
				reportStep("The given text "+text + " contains "+s,"PASS");
				//System.out.println("The given text "+text + " contains "+s);
			}else{
				reportStep("The given text "+text + "did not contain "+s,"FAIL");
				//System.out.println("The given text "+text + "did not contain "+s);
			}
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException: ELement "+xpath+" is not found","FAIL");
			//System.err.println("NoSuchElementException: ELement "+xpath+" is not found");
			throw new RuntimeException("NoSuchElementException: ELementValue "+xpath+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}
		

	}


	public void clickById(String id) {
		// TODO Auto-generated method stub
		try{
			driver.findElementById(id).click();
			reportStep("The element with class Name: "+id+" is clicked.","PASS");
			//System.out.println("The element with class Name: "+id+" is clicked.");
		}catch(NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException: ELement "+id+" is not found","FAIL");
			//System.err.println("NoSuchElementException: ELement "+id+" is not found");
			throw new RuntimeException("NoSuchElementException: ELementValue "+id+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}

	}


	public void clickByClassName(String classVal) {
		try{
			driver.findElementByClassName(classVal).click();
			reportStep("The element with class Name: "+classVal+" is clicked.","PASS");
			//System.out.println("The element with class Name: "+classVal+" is clicked.");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException: ELement "+classVal+" is not found", "FAIL");
			//System.err.println("NoSuchElementException: ELement "+classVal+" is not found");
			throw new RuntimeException("NoSuchElementException: ELementValue "+classVal+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}
	}


	public void clickByName(String name) {

		try{
			driver.findElementByName(name).click();
			reportStep("Button"+ name + " is clicked","PASS");
			//System.out.println("Button"+ name + " is clicked");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException ELement "+name+" is not found","FAIL");
			//System.err.println("NoSuchElementException ELement "+name+" is not found");
			throw new RuntimeException("NoSuchElementException ELementValue "+name+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}

	}


	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with clickByLink: "+name+" is clicked.");
		} catch (NoSuchElementException e) {
			System.err.println("The element "+name+" not found");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}finally {
			//takeSnap();
		}
	}


	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with clickByLink: "+name+" is clicked.");
		} catch (NoSuchElementException e) {
			System.err.println("The element "+name+" not found");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}finally {
			takeSnap();
		}
	}


	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("Link"+ xpathVal + "is clicked");
			reportStep("Link"+ xpathVal + "is clicked","PASS");
			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			reportStep("NoSuchElementException ELement "+xpathVal+" is not found","FAIL");
			//System.err.println("NoSuchElementException ELement "+xpathVal+" is not found");
			throw new RuntimeException("NoSuchElementException ELementValue "+xpathVal+" is not found");

		}catch (WebDriverException e) {
			reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			//System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			reportStep("From Exception Catch:driver might be closed, please debug the issue","FAIL");
			//System.err.println("From Exception Catch:driver might be closed, please debug the issue");
			throw new RuntimeException("From Exception Catch:driver might be closed, please debug the issue");
		}finally{
			takeSnap();
		}
	}


	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element "+xpathVal+" is clicked");
		} catch (NoSuchElementException e) {
			System.err.println("The element "+xpathVal+" not found");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}
	}


	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		//return null;
		String s = driver.findElementById(idVal).getText();
		System.out.println(s +" is from getTextById" );
		return s;
				
	}


	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		String s = driver.findElementByXPath(xpathVal).getText();
		System.out.println(s +" is from getTextById" );
		return s;
	}


	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement element = driver.findElementById(id);
			
			Select dropdown = new Select(element);
			
			dropdown.selectByVisibleText(value);
			
			//takeSnap();
			
			System.out.println(value +" is selected from the drop down" );
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Webelement" +id+ "is not clicked");
			throw new RuntimeException("Element not found");
		} catch(WebDriverException e)
		{
			System.err.println("Issue Exist in WebDriver");
		}finally
		{
			takeSnap();
		}


	}


	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement element = driver.findElementById(id);
			Select dropdown = new Select(element);
			
			dropdown.selectByIndex(value);
			takeSnap();
			System.out.println(value +" is selected from the drop down" );
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Webelement" +id+ "is not clicked");
			throw new RuntimeException("Element not found");
		} catch(WebDriverException e)
		{
			System.err.println("Issue Exist in WebDriver");
		}finally
		{
			takeSnap();
		}
	}


	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		Set<String> allhand = driver.getWindowHandles();
			
			//System.out.println(allhand.size());
			int cnt = allhand.size();
			for (String eachwin : allhand) {
				
				//i++;
				
				if (cnt==1) 
						{
					driver.switchTo().window(eachwin);
					break;
						}
				
				
			}
			System.out.println(+ cnt);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			

	}


	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
      Set<String> allhand = driver.getWindowHandles();
		
		System.out.println(allhand.size());
		
		for (String eachwin : allhand) {
			
	    driver.switchTo().window(eachwin);
	    
	    System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
			
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

	public int getCountByWinHandles() {
		// TODO Auto-generated method stub
		int s =0;
		Set<String> allhand = driver.getWindowHandles();
		
		 s = allhand.size();
		System.out.println(allhand.size());
		
		return s;
	}
	
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert is accepted");
		} catch (NoAlertPresentException e) {
			System.err.println("The alert window is not present");
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}finally {
			takeSnap();
		}


	}


	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert is dismissed");
		} catch (NoAlertPresentException e) {
			System.err.println("The alert window is not present");
		} catch (WebDriverException e) {
			System.err.println("The browser might have closed or not launched");
			throw new RuntimeException("The browser might have closed or not launched");
		} catch (Exception e) {
			System.err.println("Unknow exception occurred, please debug the issue");
			throw new RuntimeException("The browser might have closed or not launched");
		}finally {
			takeSnap();
		}	}


	public String getAlertText() {
		// TODO Auto-generated method stub
		return driver.switchTo().alert().getText();
		 
	}


	public long takeSnap() {
		// TODO Auto-generated method stub
		long number = (long) Math.floor(Math.random()*9000000000L)+ 10000000L;
		
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
			
		} catch (WebDriverException e) {
			reportStep("The browser has been closed.", "FAIL");
		} catch (IOException e) {
			reportStep("The snapshot could not be taken", "WARN");
		}
		return number;
	}
	/*public void takeSnap() {
		try {
			File src=driver.getScreenshotAs(OutputType.FILE);
			File dest= new File("./SNAP/snap"+i+".jpg");

			org.apache.commons.io.FileUtils.copyFile(src,dest);
			i++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("IOException: Verify whether proper location is given");
			throw new RuntimeException("IOException: Verify whether proper location is given");
		}catch (WebDriverException e) {
			System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			System.err.println("Exception: The browser is not found");
			throw new RuntimeException("Exception: Browser is not found");
		}

	}*/


	public void closeBrowser() {
		try{
			driver.close();
			System.out.println("The browser is closed");
			//reportStep("The browser is closed","PASS");
		}catch (WebDriverException e) {
			//reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			//reportStep("Exception: The browser is not found","FAIL");
			System.err.println("Exception: The browser is not found");
			throw new RuntimeException("Exception: Browser is not found");
		}
	}


	public void closeAllBrowsers() {
		try{
			driver.quit();
			System.out.println("All browsers are closed");
			//reportStep("All browsers are closed","PASS");
		}catch (WebDriverException e) {
			//reportStep("WebDriverException: driver might be closed, please debug the issue","FAIL");
			System.err.println("WebDriverException: driver might be closed, please debug the issue");
			throw new RuntimeException("WebDriverException: window might be closed, please debug the issue");
		}catch(Exception e)
		{
			//reportStep("Exception: The browser is not found","FAIL");
			System.err.println("Exception: The browser is not found");
			throw new RuntimeException("Exception: Browser is not found");
		}
	}

}
