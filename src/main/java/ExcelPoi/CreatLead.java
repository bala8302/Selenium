package ExcelPoi;



import org.testng.annotations.Test;

//import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class CreatLead extends ProjectWrappers {

	@Test(dataProvider="Exceldata",dataProviderClass=ReadExcel.class)
	public void createLead(String CN,String FN,String LN) throws InterruptedException
	{
		
		
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",CN);
		enterById("createLeadForm_firstName",FN);
		enterById("createLeadForm_lastName",LN);
		
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
				
				Thread.sleep(3000);
				verifyTextContainsById("viewLead_firstName_sp","Bala");
				
				//Thread.sleep(3000);
				
			   /*if (s1.contains("Balasubramani"))
			   {
				   System.out.println("First Name is correct");
			   }
			   else
			   {
				   System.out.println("First Name is Not correct");
			   }*/
		
		
	}
}
