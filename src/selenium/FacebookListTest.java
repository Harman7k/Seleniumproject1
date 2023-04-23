package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  
		//WebElement box = driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul"));
	
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		
			System.out.println(allLinks.size());
			
			for(int i=0; i<allLinks.size(); i++) {
				System.out.println(allLinks.get(i).getText());
			}
	}


}