package testNG;



import org.testng.annotations.Test;


import wrappers.ProjectWrappers;

public class DuplicateLead extends ProjectWrappers {

	//@Test(enabled=false)
	
	@Test(/*groups={"sanity"},*/dataProvider="fetchdata4",dataProviderClass=DP.class,invocationCount=2 /* ,invocationTimeOut=300000*/)
    
	public  void main(String emailid) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//login();
		clickByLink("Create Lead");
		clickByLink("Leads");
		
		clickByLink("Find Leads");
		
		clickByXpath("//span[contains(text(),'Email')]"); 
		
		enterByName("emailAddress",emailid);
		
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
		
		//closeBrowser();

	}

}
