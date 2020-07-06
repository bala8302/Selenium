package day3;

import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class EditLead extends  ProjectWrappers{

	@Test
	public void editLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		clickByLink("Create Lead");
		clickByLink("Find Leads");
		
		enterByXpath("(//label[text()='Lead ID:']/following::input)[2]","Jana");
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		Thread.sleep(3000);
		verifyTitle("View Lead | opentaps CRM");
		
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", "Microsoft3");
		clickByClassName("smallSubmit");
		
		verifyTextContainsById("viewLead_companyName_sp", "Microsoft3");
		//closeBrowser();
	}

}
