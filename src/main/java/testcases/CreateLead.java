package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class CreateLead extends ProjectWrappers {

	@Test
	public  void main() {
		// TODO Auto-generated method stub

		//invokeApp("chrome", "http://leaftaps.com");
		//enterById("username", "DemoSalesManager");
		//enterById("password", "crmsfa");
		//clickByClassName("decorativeSubmit");
		//clickByLink("CRM/SFA");
		
		//login();
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

}
