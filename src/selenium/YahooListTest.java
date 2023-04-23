package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		//Trending now
		
		
		//driver.findElement(By.xpath("//div[@class='D(b) Bxz(bb) end(12px) Pt(7px) wafer-tabs-target_Pt(8px)']"));
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bd']/div[1]//a"));
		////div[@class='bd']/div[1]//a - sir used
		//div[@class='bd']//a - i tried
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
			
			
			
		}
		

	}

}
