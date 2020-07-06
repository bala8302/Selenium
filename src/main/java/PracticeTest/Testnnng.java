package PracticeTest;

import org.testng.annotations.Test;

public class Testnnng {
	
	@Test(enabled=true,alwaysRun=true)
	public void Test()
	{
		System.out.println("Test");
	}
	@Test(dependsOnMethods="PracticeTest.Testnnng.Test")
	public void Test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=4,invocationCount=30,invocationTimeOut=1)
	public void Test2()
	{
		System.out.println("Bala1");
	}
	
	
	public void Testgrp()
	{
		
	}

}
