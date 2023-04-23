package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("(//div[@class='scrollWrapper_YCQ-X'])[1]/a"));
		System.out.println(all.size());                     //div[@class='scrollWrapper_YCQ-X'])[1] - i used but gave only size 1
		
		for(WebElement a : all) {
			System.out.println(a.getText());
		}

	}

}
