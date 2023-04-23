package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		//get size and text from drop down
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			if(allLinks.get(i).isSelected()) {
			//System.out.println(allLinks.get(i).getText());
				System.out.println(allLinks.get(i).getText() +"-------"+allLinks.get(i).isSelected());
			}		
		}
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(1); //Select Antiques
		Thread.sleep(2000);
		
		s.selectByValue("2984"); //select baby
	    Thread.sleep(2000);
		
		s.selectByVisibleText("Books"); //Select Books
		System.out.println("---------------After Selection----------------");
		
		for(int i=0; i<allLinks.size(); i++) {
			if(allLinks.get(i).isSelected()) {
					System.out.println(allLinks.get(i).getText() +"-------"+allLinks.get(i).isSelected());
		
			}
		
		}
	}

}
