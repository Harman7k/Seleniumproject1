package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		//size and text
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println(allLinks.size());
		
		/*for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());

	}*/
          for(WebElement a : allLinks) {
        	  System.out.println(a.getText());
          }

	}

}
