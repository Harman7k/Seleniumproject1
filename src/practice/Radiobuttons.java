package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;



public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
	    Thread.sleep(3000);
	    
		List<WebElement> radioButtons = driver.findElements(By.name("group1"));
		System.out.println(radioButtons.size());
		
		for( int i=0; i<radioButtons.size(); i++)  {
			System.out.println(radioButtons.get(i).getAttribute("value")+"-----"+radioButtons.get(i).isSelected());
		}
          driver.findElement(By.xpath("//input[@value='Cheese']")).click();		
          System.out.println("----");
          for( int i=0; i<radioButtons.size(); i++)  {
  			
        	  System.out.println(radioButtons.get(i).getAttribute("value")+"-----"+radioButtons.get(i).isSelected());
  			
  		}
          
	}

}
