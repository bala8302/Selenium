package WeekEndPrac;

import java.io.FileNotFoundException;
import java.io.UncheckedIOException;
import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class tryandcatch {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		//public RemoteWebDriver driver;
		
	//	driver = new RemoteWebDriver(remoteAddress, desiredCapabilities);
		
		ChromeDriver driver1 = new ChromeDriver();
		
		
		try
		{
			throw new ArrayIndexOutOfBoundsException("dfdfd");
			
			
			
		
		}
		catch(WebDriverException e)
		{
			e.printStackTrace();
		}
		catch(NoSuchElementException e)
		{
			e.printStackTrace();
			throw new ArithmeticException("sorry");
		}
        
	}

}
