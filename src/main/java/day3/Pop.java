package day3;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Pop extends GenericWrappers{

	@Test
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
		invokeApp("chrome", "http://www.popuptest.com/");
		
		clickByLink("Multi-PopUp Test #2");
		
		
		int cnt=0,i=0;
		cnt = getCountByWinHandles();
		for (i=0;i<cnt;i++)
		{
			if (i ==1)
			{
			
		switchToLastWindow();
		
		Thread.sleep(3000);
	
		
			}
			
			else
			{
				switchToLastWindow();
				
				Thread.sleep(3000);
				
				closeBrowser();
			}
			}
		switchToParentWindow();
		}
		
		

	}


