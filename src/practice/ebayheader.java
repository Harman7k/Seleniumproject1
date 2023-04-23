package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayheader {

	public static void main(String[] args) {
		//ebay header get size and text
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		  
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='hl-cat-nav']/ul/li"));
		//ul[@class='hl-cat-nav__container']/li
		//div[@class='hl-cat-nav']//li gives 131
		//this xpath gives size 13 but should be 11
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		

	}

}