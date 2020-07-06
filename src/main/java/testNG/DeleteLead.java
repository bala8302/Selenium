package testNG;



import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class DeleteLead extends ProjectWrappers {
	
	//@Test(dependsOnMethods={"testNG.CreateLead.main"},alwaysRun=true)
	
	//@Test(groups={"Regression"},dependsOnGroups={"sanity"})
	
	@Test(/*groups={"Regression"},dependsOnGroups={"sanity"},*/dataProvider="fetchdata2",dataProviderClass=DP.class)
	
	public void deleteLead(String PHNO) throws InterruptedException{


		clickByLink("Create Lead");
		clickByLink("Find Leads");
		clickByXpath("(//span[@class='x-tab-strip-text '])[2]");
		enterByXpath("(//input[@name='phoneCountryCode'])[1]", "1");
		enterByXpath("(//input[@name='phoneNumber'])", PHNO);
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		String s=getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		clickByClassName("subMenuButtonDangerous");
		clickByLink("Find Leads");
		enterByXpath("(//label[text()='Lead ID:']/following::input)[1]",s);
		clickByXpath("//button[text()='Find Leads']");
		verifyTextByXpath("//div[text()='No records to display']","No records to display");
		//verifyTextByClassName("x-paging-info","No records to display");
		//closeBrowser();

	}




}
