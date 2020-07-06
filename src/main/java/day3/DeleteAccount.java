package day3;

import org.junit.Test;

import wrappers.ProjectWrappers;

public class DeleteAccount extends ProjectWrappers{
	
@Test

	public void DeleteAcc() throws InterruptedException {
		// TODO Auto-generated method stub
	
	//login();
		
	clickByLink("Accounts");
	clickByLink("Find Accounts");
	
	clickByXpath("//span[text()='Phone']");
	
		//enterByXpath("//input[@name='phoneCountryCode']", "2");

		//enterByXpath("//input[@name='phoneAreaCode']", "8");
		
		enterByXpath("(//label[text()='Phone Number:'])[4]/following::input[3]", " 9943111202");
		
		clickByXpath("//button[text()='Find Accounts']");
		
		Thread.sleep(3000);
		
		String veraccno = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		
		System.out.println("accno="+veraccno);
		
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		
		Thread.sleep(3000);
		
	
		clickByXpath("//b[text()='Email Address']//following::img[2]");
		
		clickByXpath("//b[text()='Phone Number']//following::img[2]");
		
		clickByLink("Find Accounts");
		
		enterByXpath("(//label[text()='Account ID:']/following::input)[1]", veraccno);
		
		clickByXpath("//button[text()='Find Accounts']");
		
		
		verifyTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-formatedPrimaryPhone'][1]","");
		
		
		closeBrowser();
		
		
		
		

	}

}
