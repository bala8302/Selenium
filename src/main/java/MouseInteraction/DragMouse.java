package MouseInteraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://jqueryui.com/draggable/");

		driver.manage().window().maximize();

		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));

		WebElement drag = driver.findElementById("draggable");

		Actions builder = new Actions(driver);

		builder.dragAndDropBy(drag, 200, 200).perform();
		//builder.moveToElement(drag).

		//builder.se

		//builder.contextClick(drag).perform();

		// builder.

		// builder.dragAndDrop(source, target)

		// builder.clickAndHold(onElement).moveByOffset(xOffset, yOffset)

	}

}
