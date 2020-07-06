package day3;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TestforException extends GenericWrappers {

@Test	
	public  void main() {
		// TODO Auto-generated method stub
		
		invokeApp("chrome", "http://leaftaps.com");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");

	}

}
