package day3;

import org.junit.Test;

import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;


public class MergeLeadWrap extends ProjectWrappers {
	
@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//invokeApp("chrome", "http://leaftaps.com/control/main");
		//enterById("username", "DemoSalesManager");
		//enterById("password", "crmsfa");
		//clickByClassName("decorativeSubmit");
		//clickByLink("CRM/SFA");
		//login();
		clickByLink("Create Lead");
		clickByLink("Leads");
		
		clickByLink("Merge Leads");
		
		Thread.sleep(2000);
		
		clickByXpath("(//img[@alt='Lookup'])[1]");
		
		Thread.sleep(2000);
          
		switchToLastWindow();
		
		
		Thread.sleep(2000);
		
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","%10%");
		
		Thread.sleep(2000);
		
		
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		Thread.sleep(8000);
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		Thread.sleep(2000);
		
		switchToParentWindow();
		
		Thread.sleep(2000);
		
		clickByXpath("(//img[@alt='Lookup'])[2]");
		
		Thread.sleep(2000);
        
		switchToLastWindow();
		
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","%10%");
		
		Thread.sleep(2000);
         
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		 Thread.sleep(8000);
         
         
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a"); 
		 
		 Thread.sleep(2000);
		 
		 switchToParentWindow();
        
		 Thread.sleep(2000);
	  		
		 clickByLinkNoSnap("Merge");
		 
		 Thread.sleep(6000);
		 
		 acceptAlert();

		 Thread.sleep(2000);
		 clickByLink("Find Leads");
		 
		 Thread.sleep(2000);
		
		 enterByXpath("//label[contains(text(),'Lead ID:')]/following::input","999999");
		 
		 clickByXpath("//button[contains(text(),'Find Leads')]");
		 
		 String s1 = getTextByXpath("//div[contains(text(),'No records to display')]");
		 
		 System.out.println(s1);
		 
		 verifyTextContainsByXpath("//div[contains(text(),'No records to display')]","No Records Display");   
		 
	}
	
	

}
