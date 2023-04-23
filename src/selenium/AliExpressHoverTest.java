package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AliExpressHoverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(3000);
		// now how to perform hover, there is a inbuilt class action, need to create object, need to pass driver
		//and find out if its java scripted popup or website popup, use accordingly code
		
		List<WebElement> popup = driver.findElements(By.className("btn-close"));
	        System.out.println(popup.size());
	        
	       if(popup.size()>0) {
	    	   driver.findElement(By.className("btn-close")).click();
	    	  
	       }
	       
		WebElement fashion = driver.findElement(By.linkText("Women's Fashion"));
        Actions builder = new Actions(driver);
        builder.moveToElement(fashion).build().perform();
        
        Thread.sleep(2000);
      List<WebElement> all = driver.findElements(By.xpath("(//dl[@class='sub-cate-items'])[1]//a"));
        System.out.println(all.size());                     //(//div[@class='sub-cate-row'])[1]/dl[1]//a - sir used 
        
        
        //for(int i=0; i<all.size(); i++) {
         	//System.out.println(all.get(i).getText());
         	
        for(WebElement a : all) {
             	System.out.println(a.getText());
             }
        }
         	 

 	}
        
        
     


