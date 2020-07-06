package testNG;



import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class EditLead extends  ProjectWrappers{

	@Test(dependsOnMethods={"testNG.CreateLead.main"})
	//@Test(/*groups={"sanity"},dependsOnGroups={"smoke"},*/ dataProvider="fetchdata1",dataProviderClass=DP.class)
	
	public void editLead(String FN,String ChCName) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		login();
		clickByLink("Create Lead");
		clickByLink("Find Leads");
		
		enterByXpath("(//label[text()='Lead ID:']/following::input)[2]",FN);
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		Thread.sleep(3000);
		verifyTitle("View Lead | opentaps CRM");
		
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", ChCName);
		clickByClassName("smallSubmit");
		
		verifyTextContainsById("viewLead_companyName_sp", "Microsoft3");
		//closeBrowser();
	}

}
