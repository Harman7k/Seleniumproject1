package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(3000);
		
		//get size and text for 3 milk,butter,cheese
		
		//List<WebElement> allLinks = driver.findElements(By.xpath("//input[@name='group1']")); - i used this one
		//List<WebElement> allLinks = driver.findElements(By.name("group1"));
		
		//System.out.println(allLinks.size());
		//for(int i=0; i<allLinks.size(); i++) {
			//System.out.println(allLinks.get(i).getAttribute("value"));
		List<WebElement> radioButtons = driver.findElements(By.name("group1"));
		System.out.println(radioButtons.size());
			
		for(int i=0; i<radioButtons.size(); i++) {
			System.out.println(radioButtons.get(i).getAttribute("value")+"------"+radioButtons.get(i).isSelected());

	}
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		//radioButtons.get(2).click();   // can use any code both should working and give o/p for cheese
		System.out.println("-----");
		
		for(int i=0; i<radioButtons.size(); i++) {
			System.out.println(radioButtons.get(i).getAttribute("value")+"------"+radioButtons.get(i).isSelected());
			

		

		}
	}
}



