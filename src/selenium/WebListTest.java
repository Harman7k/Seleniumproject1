package selenium;

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
          //driver.findElement(By.tagName("a"))
		//driver.findElements(By.tagName("a"));
		
		//WebElement first = driver.findElement(By.tagName("a"));
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//for footer
		
       //WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		
		//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		//now for left hand side footer
		
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		//from this find 3 expected links
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		//WebElement first = driver.findElement(By.tagName("agjjxccckzcc")); //will give error cz unable to locate element, 
		//webelemet must present but in list it will say 0 but not error
		
		
		
	}
}		
		


