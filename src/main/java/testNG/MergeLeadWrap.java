package testNG;



import org.testng.annotations.Test;


import wrappers.ProjectWrappers;


public class MergeLeadWrap extends ProjectWrappers {
	
  //@Test(enabled=false)
	
	@Test(/*enabled=false,groups={"Regression"},dependsOnGroups={"sanity"},*/dataProvider="fetchdata3",dataProviderClass=DP.class)
	public  void main(String FL,String TL,String Dum) throws InterruptedException {
		
	
	    clickByLink("Create Lead");
		clickByLink("Leads");
		
		clickByLink("Merge Leads");
		
		Thread.sleep(2000);
		
		clickByXpath("(//img[@alt='Lookup'])[1]");
		
		Thread.sleep(2000);
          
		switchToLastWindow();
		
		
		Thread.sleep(2000);
		
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",FL);
		
		Thread.sleep(2000);
		
		
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		Thread.sleep(4000);
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		Thread.sleep(2000);
		
		switchToParentWindow();
		
		Thread.sleep(2000);
		
		clickByXpath("(//img[@alt='Lookup'])[2]");
		
		Thread.sleep(2000);
        
		switchToLastWindow();
		
		enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",TL);
		
		Thread.sleep(2000);
         
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		 Thread.sleep(4000);
         
         
		 clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a"); 
		 
		 Thread.sleep(2000);
		 
		 switchToParentWindow();
        
		 Thread.sleep(2000);
		// System.out.println("bala1");
		// clickByLinkNoSnap("Merge");
		 
		 clickByLink("Merge");
		 
		 System.out.println("bala2");
		 
		 Thread.sleep(4000);
		 
		 acceptAlert();

		 Thread.sleep(2000);
		 clickByLink("Find Leads");
		 
		 Thread.sleep(2000);
		
		 enterByXpath("//label[contains(text(),'Lead ID:')]/following::input",Dum);
		 
		 clickByXpath("//button[contains(text(),'Find Leads')]");
		 
		 String s1 = getTextByXpath("//div[contains(text(),'No records to display')]");
		 
		 System.out.println(s1);
		 
		 verifyTextContainsByXpath("//div[contains(text(),'No records to display')]","No Records Display");   
		 
	}
	
	

}
