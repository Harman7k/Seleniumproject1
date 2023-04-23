package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.com/");
		  
		  driver.findElement(By.linkText("About")).click();
		  //driver.findElement(By.partialLinkText("Abo")).click();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		  //Thread.sleep(3000);
 String expectedTitle = "Google - About Google, Our Culture & Company News";
 String actualTitle = driver.getTitle();
 System.out.println(actualTitle);
 
 wait.until(ExpectedConditions.urlContains("https://about.google"));
 
   String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
   String actualUrl = driver.getCurrentUrl();
   System.out.println(actualUrl);
 
 if(expectedTitle.equals(actualTitle) && expectedUrl.equals(actualUrl)) {
	 System.out.println("Pass");
 }else {
	 System.out.println("Fail");
	 
 }
 
	}
	

}
