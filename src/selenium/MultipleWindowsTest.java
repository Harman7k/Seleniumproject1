package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		
		
		//driver.getWindowHandles()             //here return type is set
		//driver.switchTo().window(null); //in built class for switch to another window
		                         //we need to pass handle for particular window
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allWindows = driver.getWindowHandles(); //Assume this is list
		System.out.println(allWindows.size());
		
		//allWindows.iterator // u cant read directly from set, then u need iterator, save into iterator
		 
		Iterator<String> itr = allWindows.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow); // handle for window
		Thread.sleep(2000);
		System.out.println(driver.getTitle()); //help page title
		driver.close(); //if u want to close this page
		
		driver.switchTo().window(mainWindow); 
		Thread.sleep(2000);
		System.out.println(driver.getTitle()); //gmail page title
		driver.quit(); //quit will close bothn the browsers but close only close the particular browser that we want to
	}

}
