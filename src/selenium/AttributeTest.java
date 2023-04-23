package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AttributeTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("https://www.ebay.ca/");

		   // String s = "selenium code which read search for anything";
		    
		    	//System.out.println(s);
		    	String s = driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		    	
				System.out.println(s);
				
				driver.findElement(By.id("gh-ac")).sendKeys("iphone");
				String p = driver.findElement(By.id("gh-ac")).getAttribute("value");
				System.out.println(p);
				

		    	
	}

}
