package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://ca.yahoo.com/");
			
			//driver.findElement(By.xpath("//div[@class='D(b) Bxz(bb) end(12px) Pt(7px) wafer-tabs-target_Pt(8px)']"));
			List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@role='presentation']/li"));
			
			//ul[@role='presentation']/li - sir used
			//div[@id='ybar-navigation']//li/a" - i tried this (choose near one)
			
			System.out.println(allLinks.size());
			
			for(int i=0; i<allLinks.size(); i++) {
				System.out.println(allLinks.get(i).getText());

	}

}
}