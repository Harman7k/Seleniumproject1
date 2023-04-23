package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
	    Thread.sleep(3000);
	    
	    List<WebElement> radiobuttons = driver.findElements(By.name("group2"));
	    System.out.println(radiobuttons.size());
	    
	    for(int i=0; i<radiobuttons.size(); i++) {
	    	System.out.println(radiobuttons.get(i).getAttribute("value"));
	    }
  driver.findElement(By.xpath("//input[@value='Beer']")).click();
  System.out.println("---");
  
  for(int i=0; i<radiobuttons.size(); i++) {
	  
	  System.out.println(radiobuttons.get(i).getAttribute("value")+"-----"+radiobuttons.get(i).isSelected());
  }
  
	}

	}
