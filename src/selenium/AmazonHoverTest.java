package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		// now how to perform hover, there is a inbuilt class action, need to create object, need to pass driver
		
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
        Actions builder = new Actions(driver);
        //builder.moveToElement(accounts).build().perform();
        builder.moveToElement(signIn).build().perform(); 
       
        Thread.sleep(2000);
        List<WebElement> all = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
        System.out.println(all.size());
        
       for(int i=0; i<all.size(); i++) {
        	System.out.println(all.get(i).getText());
       }
        	 /*for(WebElement a : all) {
        	System.out.println(a.getText());
        }*/

        	
        }
	}

       
	


