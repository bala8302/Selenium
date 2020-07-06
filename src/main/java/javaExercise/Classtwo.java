package javaExercise;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classtwo extends Classone{

 
	public void test()
	{
		System.out.println("test2");
		
		}
	
	
	public static void main(String[] args) throws HeadlessException, AWTException
	{
		//Classone c1 = new Classtwo();
		//c1.test();
	
		Classone c1 = new Classone();
		
		c1.run();
		
		BufferedImage img = new Robot().createScreenCapture
				(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		
	   //ImageIO.W
		
		ChromeDriver driver = new ChromeDriver();
		
		
		//driver.manage().timeouts().setScriptTimeout(time, unit)
	}
	
	
}
