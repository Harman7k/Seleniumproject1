package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");


		//classname objname = new classname();
		FirefoxDriver driver = new FirefoxDriver(); 
				
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("fhgfgmfdmd");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("egkfgjmfg");
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		
		//driver.findElement(By.id("email")).sendKeys("hjkhsdkjhsdkhsdk");
		//driver.findElement(By.id("pass")).sendKeys("sdljgdksgff");
		//driver.findElement(By.id("login")).click();
		
		

	}
	

	
}
