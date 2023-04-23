package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca");
		//amazon header size and text - should 27 links and text depends upon screen size
		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		//div[@id='nav-main']//a
		////div[@class='nav-sprite']//a
		//div[@id='nav-xshop']/a
		
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());


	}

}
}

	


