package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable");
      List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
      System.out.println(sortable.size());
      
      if(sortable.size()>0) {
    	  System.out.println("sortable present");
    	  
      }else {
    	  System.out.println("sortable not present");
      }
      
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable present");
		}else {
			System.out.println("draggable not present");
		}
		
		System.out.println("-----After switching to frame----");
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		sortable = driver.findElements(By.linkText("Sortable"));
	      System.out.println(sortable.size());
	      
	      if(sortable.size()>0) {
	    	  System.out.println("sortable present");
	    	  
	      }else {
	    	  System.out.println("sortable not present");
	      }
	      
			draggable = driver.findElements(By.id("draggable"));
			System.out.println(draggable.size());
			
			if(draggable.size()>0) {
				System.out.println("draggable present");
			}else {
				System.out.println("draggable not present");
			}
			
		System.out.println("------switching back to main page-----");
		driver.switchTo().defaultContent();
		
		sortable = driver.findElements(By.linkText("Sortable"));
	      System.out.println(sortable.size());
	      
	      if(sortable.size()>0) {
	    	  System.out.println("sortable present");
	    	  
	      }else {
	    	  System.out.println("sortable not present");
	      }
	      
			draggable = driver.findElements(By.id("draggable"));
			System.out.println(draggable.size());
			
			if(draggable.size()>0) {
				System.out.println("draggable present");
			}else {
				System.out.println("draggable not present");
			}
		
	}

}
