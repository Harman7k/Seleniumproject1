package selenium;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardButtonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("About")).click();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		//Thread.sleep(3000);
		System.out.println(driver.getTitle()); //about page title
		
		driver.navigate().back();
		wait.until(ExpectedConditions.titleIs("Google"));
		//Thread.sleep(3000);
		System.out.println(driver.getTitle()); //google page title
		
		driver.navigate().forward();
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		//Thread.sleep(3000);
		System.out.println(driver.getTitle()); //google page title
	}

}
