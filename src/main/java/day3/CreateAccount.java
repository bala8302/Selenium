package day3;

import org.junit.Test;

import wrappers.ProjectWrappers;

public class CreateAccount extends ProjectWrappers {
	
	@Test
	public void createac() throws InterruptedException
	{
		//login();
		
		clickByLink("Accounts");
		clickByLink("Create Account");
		
		enterById("accountName","balasubramani84787");
		
		//String acname = getTextById("accountName");
		
		//System.out.println(acname);
		enterById("primaryPhoneNumber","665656556");
		
		enterById("primaryEmail","bala891@gmail.com");
		
		clickByXpath("//input[@type='submit']");
		
		String s3 =getTextByXpath("//span[contains(text(),'balasub')]");
		
		System.out.println("s3="+s3);
		
		String acid;
		
		acid = s3.substring(s3.indexOf("(") + 1, s3.indexOf(")"));
		
		String acname;
		
		acname =s3.substring(0, s3.indexOf("(")-1);
		
		Thread.sleep(3000);
		
		clickByLink("Find Accounts");
		
		Thread.sleep(3000);
		
		enterByXpath("(//label[text()='Account ID:']/following::input)[1]", acid);
		
		enterByXpath("(//label[text()='Account ID:']/following::input)[2]", acname);
		
		clickByXpath("//button[text()='Find Accounts']");
		
		Thread.sleep(4000);
		
		String veraccno = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		
		System.out.println("accno="+veraccno);
		
		String veraccname = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a)[1]");
		
		System.out.println("accname="+veraccname);
		
		String veraccphnumber = getTextByXpath("//div[contains(text(),'665656556')]");
		System.out.println("accphnum="+veraccphnumber);
		
		String veraccemailid = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-primaryEmail']/a)[1]");
		System.out.println("accemaild="+veraccemailid);
		
		verifyTextContainsByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-primaryEmail']/a)[1]","bala891@gmail.com");
		
		verifyTextContainsByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]",acid);
		
		verifyTextContainsByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a)[1]",acname);
		
		verifyTextContainsByXpath("//div[contains(text(),'984494411')]","665656556");
		
		closeBrowser();
		
		
	}

}
