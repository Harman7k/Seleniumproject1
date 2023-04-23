package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");

				//type Canada in search box
		       //size - 10
		      //print text
		driver.findElement(By.name("q")).sendKeys("Canada");
				Thread.sleep(2000);
				
				
				List<WebElement> all = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
				System.out.println(all.size());
				
				for(int i=0; i<all.size(); i++) {
					
					System.out.println(all.get(i).getText());
				}
				/*for(WebElement a : all) {   //or use this for loop give same result
					System.out.println(a.getText());
				}*/   
				
	}
}				
	
