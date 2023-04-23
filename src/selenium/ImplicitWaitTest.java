package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
       //implicitlywait is applicable to only those elements where u r finding the element
      //implicit wait time is the maximum time not fixed, find element and perform action on next linen Thread.sleep is fixed time
       driver.findElement(By.linkText("Create new account")).click();
       //Thread.sleep(3000);
     
 driver.findElement(By.name("lastname")).sendKeys("hgjhgjhgj");
 driver.findElement(By.name("reg_email__")).sendKeys("6785677898");
 System.out.println(driver.findElement(By.name("reg_email__")).getAttribute("value"));
 driver.findElement(By.id("password_step_input")).sendKeys("yuhjk");
 driver.findElement(By.name("websubmit")).click();
 
 WebElement month = driver.findElement(By.id("month"));
 WebElement day = driver.findElement(By.id("day"));
 WebElement year = driver.findElement(By.id("year"));
 
	Select m = new Select(month);
	m.selectByValue("7"); //select month
  Thread.sleep(2000);
  
  Select d = new Select(day);
	d.selectByValue("20"); //select day
  Thread.sleep(2000);
  
  Select y = new Select(year);
	y.selectByValue("2000"); //select year
  Thread.sleep(2000);
  
  //now select radio button
  driver.findElement(By.xpath("//label[text()='Female']")).click();
  //xpath //input[@value='1'] - sir used //female radio button
  
   driver.findElement(By.name("websubmit")).click();   
  


	}

}
