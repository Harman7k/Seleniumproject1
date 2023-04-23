package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooHeader {

	public static void main(String[] args) {
		//get size and text for header
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ca.yahoo.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='ybar-navigation']//li"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			
		}
		

	}

}
