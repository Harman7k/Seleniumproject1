package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//create webelement for 2 of those - drag me to my target and drop here then run code and fix error
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
	
		 WebElement draggable = driver.findElement(By.id("draggable"));
		 WebElement droppable = driver.findElement(By.id("droppable"));
		 
		 //now drag one box over the other
		System.out.println(droppable.getText()); 
      Actions builder = new Actions(driver);
      builder.dragAndDrop(draggable, droppable).build().perform();
      //now verify if draganddrop is working so use line no. 23 and 27
      System.out.println(droppable.getText());
      
      //try use if else statement to verify
      
      
      
	}

}
