package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allLinks.size());
		for (int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			System.out.println(allLinks.get(i).getText()+"-----"+allLinks.get(i).isSelected());
		}
   WebElement box = driver.findElement(By.id("gh-cat"));
   Select s = new Select(box);
   
   s.selectByIndex(1); //Antiques true rest false
   Thread.sleep(2000);
   
   s.selectByIndex(6); //Business & Industrial true rest false
   Thread.sleep(2000);
   
   s.selectByValue("625"); //cameras & photos
   Thread.sleep(2000);
   
   s.selectByVisibleText("Automotive");
   Thread.sleep(2000);
   
   for (int i=0; i<allLinks.size(); i++) {
	   //if(allLinks.get(i).isSelected()) {
		
		System.out.println(allLinks.get(i).getText()+"-----"+allLinks.get(i).isSelected());
		
	   }	
	
   
	}
	}
//}
