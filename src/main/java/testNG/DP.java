package testNG;

import org.testng.annotations.DataProvider;

public class DP {

	//Create Lead
@DataProvider(name="fetchdata")
	
	public Object[][] data()
	{
		Object[][] testdata= new Object[1][3];
	
		testdata [0][0] ="CSC INDIA";
		testdata [0][1] ="Bala";
		testdata [0][2] ="subramani";
		/*testdata [1][0] ="TCS";
		testdata [1][1] ="grrf";
		testdata [1][2] ="ddgdg";
		*/return testdata;
	}

//Edit Lead
@DataProvider(name="fetchdata1")

public Object[][] data1()
{
	Object[][] testdata= new Object[1][2];

	testdata [0][0] ="Jana";
	testdata [0][1] ="Microsoft3";
	return testdata;
}

//Delete Lead
@DataProvider(name="fetchdata2")

public Object[][] data2()
{
	Object[][] testdata= new Object[1][1];

	testdata [0][0] ="9486630354";
	
	return testdata;
}

//Merge Lead
@DataProvider(name="fetchdata3")

public Object[][] data3()
{
	Object[][] testdata= new Object[1][3];

	testdata [0][0] ="%10%";
	testdata [0][1] ="%20%";
	testdata [0][2] ="999999999";
	
	return testdata;
}

//Merge Lead
@DataProvider(name="fetchdata4")

public Object[][] data4()
{
	Object[][] testdata= new Object[2][1];

	testdata [0][0] ="bala8302@gmail.com";
	testdata [1][0] ="umesh8303@gmail.com";
	
	return testdata;
}


}
