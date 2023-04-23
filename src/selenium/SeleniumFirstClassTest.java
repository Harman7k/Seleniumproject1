package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");


		//classname objname = new classname();
		FirefoxDriver driver = new FirefoxDriver(); 
				
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hjkhsdkjhsdkhsdk");
		driver.findElement(By.id("pass")).sendKeys("sdljgdksgff");
		driver.findElement(By.id("login")).click();
		
	}
	

}
