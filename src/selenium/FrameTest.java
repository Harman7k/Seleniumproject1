package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  
		  List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		  System.out.println(sortable.size());
			
			if(sortable.size()>0) {
				System.out.println("sortable Present");
			}else {
		         System.out.println("sortable not present");	
		}
			 List<WebElement> draggable = driver.findElements(By.id("draggable"));
			  System.out.println(draggable.size());
				
				if(draggable.size()>0) {
					System.out.println("draggable Present");
				}else {
			        System.out.println("draggable not present");	
			}
				System.out.println("----After switching to the frame-------");
				//driver.switchTo().frame(0); //By index
				//driver.switchTo().frame("demo-frame"); only for name and id, in this case we cant use this option
	driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //By webelement
	
	  sortable = driver.findElements(By.linkText("Sortable"));
	  System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable Present");
		}else {
	System.out.println("sortable not present");	
	}
		 draggable = driver.findElements(By.id("draggable"));
		  System.out.println(draggable.size());
			
			if(draggable.size()>0) {
				System.out.println("draggable Present");
			}else {
		System.out.println("draggable not present");	
		}
	System.out.println("------Switching back to main page----");
	driver.switchTo().defaultContent();
	
	 sortable = driver.findElements(By.linkText("Sortable"));
	  System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable Present");
		}else {
	        System.out.println("sortable not present");	
	}
		 draggable = driver.findElements(By.id("draggable"));
		 System.out.println(draggable.size());
			
			if(draggable.size()>0) {
				System.out.println("draggable Present");
			}else {
		        System.out.println("draggable not present");	
		}
	
	
	
	}
	

}
