package day3;

import org.junit.Test;

import wrappers.ProjectWrappers;

public class MergeAccount extends ProjectWrappers {
@Test
	public void mergeacc() throws InterruptedException
	{
		//login();
		
		clickByLink("Accounts");
		clickByLink("Merge Accounts");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		Thread.sleep(2000);
        
		switchToLastWindow();
		
		Thread.sleep(2000);
		
		enterByXpath("//label[contains(text(),'Account ID:')]/following::input","%50%");
		Thread.sleep(2000);
		
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		
		Thread.sleep(8000);
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		Thread.sleep(2000);
		
		switchToParentWindow();
		
		Thread.sleep(2000);
		
		clickByXpath("(//img[@alt='Lookup'])[2]");
		
		Thread.sleep(2000);
        
		switchToLastWindow();
		
		enterByXpath("//label[contains(text(),'Account ID:')]/following::input","%10%");
		
		Thread.sleep(2000);
         
		clickByXpath("//button[contains(text(),'Find Accounts')]");
		
		 Thread.sleep(8000);
         
         
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"); 
		 
		 Thread.sleep(2000);
		 
		 switchToParentWindow();
        
		 Thread.sleep(2000);
	  		
		 clickByLinkNoSnap("Merge");
		 
		 Thread.sleep(6000);
		 
		 acceptAlert();
	
		 Thread.sleep(2000);
		 clickByLink("Find Accounts");
		 
		 Thread.sleep(2000);
		
		 enterByXpath("//label[contains(text(),'Account ID:')]/following::input","999999");
		 
		 clickByXpath("//button[contains(text(),'Find Accounts')]");
		 
		 String s1 = getTextByXpath("//div[contains(text(),'No records to display')]");
		 
		 System.out.println(s1);
		 
		 verifyTextContainsByXpath("//div[contains(text(),'No records to display')]","No Records Display");
		 
		 closeBrowser();
		 
	}
		
	
	}
	

