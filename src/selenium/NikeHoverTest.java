package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeHoverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		// now how to perform hover, there is a inbuilt class action, need to create object, need to pass driver
		
		WebElement fashion = driver.findElement(By.linkText("Men"));
        Actions builder = new Actions(driver);
        builder.moveToElement(fashion).build().perform();
        
        Thread.sleep(2000);
        List<WebElement> all = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Men, Shoes')]"));
        System.out.println(all.size());                      
      //div[@class='pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2'])[7]/a - i tried        
       for(int i=0; i<all.size(); i++) {
        	System.out.println(all.get(i).getText());
       }
        	 /*for(WebElement a : all) {
        	System.out.println(a.getText());
        }*/

	}

}
