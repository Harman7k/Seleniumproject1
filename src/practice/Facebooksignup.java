package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("email")).sendKeys("fhgfgf");
		//driver.findElement(By.id("pass")).sendKeys("687567865765");
		//driver.findElement(By.name("login")).click();
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select s = new Select(month);
		s.selectByValue("7");
		Thread.sleep(2000);
		
		Select d = new Select(day);
		d.selectByValue("20");
		Thread.sleep(2000);
		
		Select y = new Select(year);
		y.selectByValue("2000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
