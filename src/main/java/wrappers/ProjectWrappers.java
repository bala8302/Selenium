package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ProjectWrappers extends GenericWrappers{

	
	
	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}
	
	
	
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

   
	// TODO Auto-generated method stub
	@Parameters({"URL","Uname","Pwd"})
	
	@BeforeMethod(groups={"common"})
	public void login(String URL,String Username,String Pwd)
	{
	    startTestCase("CreatLead","Executing the CreateLead");
		test.assignAuthor("Bala");
		test.assignCategory("smoke");
		
		invokeApp("chrome", URL);
		enterById("username", Username);
		enterById("password", Pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		System.out.println("Calling login inside wrapper");


	}


	//@AfterMethod(groups={"common"})
	
	@AfterMethod
	public void quitbrowswer()
	{
		closeBrowser();
		endTestcase();
		System.out.println("Calling closebrowser outside wrapper");
	}

}


