package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooList {

	public static void main(String[] args) {
		// get size and list for trending now
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bd']//a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			
		}
		
	

	}

}
