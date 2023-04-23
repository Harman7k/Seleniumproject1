package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(5000);
		//write code which click on careers
		
	WebElement careers = driver.findElement(By.linkText("Careers"));
	
	//output error says not clickable, its rare case if it dsnt clk like this
	//we have to drag the bar and then find careers(element careers is not in view)
	// now how to scroll the scroll bar through automation script
	//we have inbuilt class - JavaScriptExecuter
	
	JavascriptExecutor jse = (JavascriptExecutor)driver; //add cast 
	//option 1 = using X and Y coordinate
	//System.out.println(careers.getLocation());
	 //jse.executeScript("window.scrollBy(0,4000)");
	 //careers.click();
	
	//now try option 2 - scroll until the element is in the view
	 //jse.executeScript("arguments[0].scrollintoView(true);", careers);
     //careers.click();
	
	//option 3 - direct click
	jse.executeScript("arguments[0].click();", careers);
	}

}
