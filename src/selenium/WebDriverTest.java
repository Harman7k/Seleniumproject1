package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");


		//classname objname = new classname();
		//FirefoxDriver driver = new FirefoxDriver(); 
		//ParentClassName(Interface) objName = new className();
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hjkhsdkjhsdkhsdk");
		driver.findElement(By.id("pass")).sendKeys("sdljgdksgff");
		driver.findElement(By.id("login")).click();
		

		
	}
	

}
