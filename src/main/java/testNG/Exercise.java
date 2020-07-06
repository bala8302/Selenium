package testNG;

import org.testng.annotations.Test;

public class Exercise {

	
		@Test(dependsOnMethods={"testNG.Exercise.Test2"})
		public void Test1()
		{
			System.out.println("Test1");
		}
		
		
		@Test(enabled=true,invocationCount=200,timeOut=1000,threadPoolSize=3)
		public void Test2()
		{
			System.out.println("Test2");
		}
		
	

}
