package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CCSelectorTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");


		//classname objname = new classname();
		FirefoxDriver driver = new FirefoxDriver(); 
				
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("hjkhsdkjhsdkhsdk");
		driver.findElement(By.cssSelector("#pass")).sendKeys("sdljgdksgff");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		

	}

}
