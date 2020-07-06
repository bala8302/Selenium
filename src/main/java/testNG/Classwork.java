package testNG;

import org.testng.annotations.Test;

import wrappers.ProjectWrappers;

public class Classwork extends ProjectWrappers{
	
	
	@Test(alwaysRun=true)
	public  void main()
	{
				
		
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","CSC INDIA");
		enterById("createLeadForm_firstName","Balasubramani");
		enterById("createLeadForm_lastName","Thangaraj");
		
		selectVisibileTextById("createLeadForm_dataSourceId","Cold Call");
		
		selectVisibileTextById("createLeadForm_marketingCampaignId","Automobile");	
		
		//ENter Dropdown
				selectVisibileTextById("createLeadForm_industryEnumId","Press");
				selectVisibileTextById("createLeadForm_ownershipEnumId","LLC/LLP");
				selectVisibileTextById("createLeadForm_generalStateProvinceGeoId","Alaska");
				
				enterById("createLeadForm_numberEmployees", "12");
				enterById("createLeadForm_sicCode", "NA");
				enterById("createLeadForm_tickerSymbol", "NA");
				enterById("createLeadForm_description", "NA");
				enterById("createLeadForm_importantNote", "NA");
				enterById("createLeadForm_primaryPhoneAreaCode", "NA");
				enterById("createLeadForm_primaryPhoneNumber", "NA");
				enterById("createLeadForm_primaryPhoneExtension", "NA");
				enterById("createLeadForm_primaryPhoneAskForName", "NA");
				enterById("createLeadForm_primaryEmail", "bala8302@gmail.com");
				enterById("createLeadForm_primaryWebUrl", "www.gmail.com");
				enterById("createLeadForm_generalToName", "NA");
				enterById("createLeadForm_generalAttnName", "NA");
				enterById("createLeadForm_generalAddress1", "NA");
				enterById("createLeadForm_generalAddress2", "NA");
				enterById("createLeadForm_generalCity", "NA");
				enterById("createLeadForm_generalPostalCode", "600044");
				enterById("createLeadForm_generalPostalCodeExt", "445");

				clickByName("submitButton");
		
				String s1= getTextById("viewLead_firstName_sp");
				System.out.println(s1);
				
			   if (s1.contains("Balasubramani"))
			   {
				   System.out.println("First Name is correct");
			   }
			   else
			   {
				   System.out.println("First Name is Not correct");
			   }
			   
				
	}
	
	
	
	@Test(alwaysRun=true)
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
