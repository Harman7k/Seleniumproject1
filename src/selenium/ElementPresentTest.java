package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//if(driver.findElement(By.linkText("About")).isDisplayed()) {
		
		/*if(driver.findElement(By.linkText("Aboutbjhghjgj")).isDisplayed()) { //will give error unable to locate
			System.out.println("Element Present");
		}else {
			System.out.println("Element Not Present");
		}*/
//how we know if element is present or not, we need list
		
		List<WebElement> element = driver.findElements(By.linkText("Aboutbdcmmchbc"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
	System.out.println("Element not present");	
	}
	
}
}