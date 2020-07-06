package day3;

import org.junit.Test;

import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class DuplicateLead extends ProjectWrappers {
@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
	//	invokeApp("chrome", "http://leaftaps.com/control/main");
		//enterById("username", "DemoSalesManager");
		//enterById("password", "crmsfa");
		//clickByClassName("decorativeSubmit");
		//clickByLink("CRM/SFA");
		//login();
		clickByLink("Create Lead");
		clickByLink("Leads");
		
		clickByLink("Find Leads");
		
		clickByXpath("//span[contains(text(),'Email')]"); 
		
		enterByName("emailAddress","bala8302@gmail.com");
		
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		Thread.sleep(3000);
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		Thread.sleep(3000);
		
		clickByLink("Duplicate Lead");
		
		String s1 = getTextByXpath("//div[contains(text(),'Duplicate Lead')]");
		
		// verifyTextContainsByXpath("//div[contains(text(),'Duplicate Lead')]","No Records Display");
		
		//clickByLink("Create Lead");
		
		verifyTitle(s1);
		Thread.sleep(2000);
		
		clickByClassName("smallSubmit");
		
		closeBrowser();

	}

}
