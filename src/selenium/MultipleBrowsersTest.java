package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleBrowsersTest {
	public static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
        //FirefoxDriver driver = new FirefoxDriver(); 
		
		String browser = "Firefox"; //Chrome, Safari //Read this value from data file, Excel, Properties,..
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
	        driver = new FirefoxDriver(); 	
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			//System.setProperty("webdriver.safari.driver", "");
			//SafariDriver driver = new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hjkhsdkjhsdkhsdk");
		driver.findElement(By.id("pass")).sendKeys("sdljgdksgff");
		driver.findElement(By.id("login")).click();
		

	}

}
