package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
      //classname objname = new classname();
		FirefoxDriver driver = new FirefoxDriver(); 
	    driver.get("https://www.google.com/");

	   // driver.findElement(By.tagName("a"));
	    //WebElement first = driver.findElement(By.tagName("a"));
	    //List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    //System.out.println(allLinks.size());
	    
	    WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
	    //List<WebElement> allLinks = footer.findElements(By.tagName("a"));
	    List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']"));
	    
	    
	   for(int i=0; i<allLinks.size(); i++) {
	    	System.out.println(allLinks.get(i).getText());
	    }
	    
	    
	    
	    
	}

}
