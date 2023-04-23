package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
  driver.get("https://www.facebook.com/");
  
 //driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ghghjgsytdys");
  
 //driver.findElement(By.cssSelector(""));
  
 driver.findElement(By.id("email")).sendKeys("yyrtrtjhfhgfhgfr");
  
//driver.findElement(By.linkText(""));
  
 driver.findElement(By.name("email")).sendKeys("ytersfdfdfhjhkuhkughjhg");
  
 //driver.findElement(By.partialLinkText(""));
  
 //driver.findElement(By.tagName("input")).sendKeys("uyghgjfghflihl");
  
 driver.findElement(By.xpath("//input[@placeholder='Email or phone number']")).sendKeys("kjgjhg");
  
 //driver.findElement(By.id("email")).sendKeys("yrtichfjgakljflkj");
  
  
 
  driver.findElement(By.name("pass")).sendKeys("gdjhgdjhghjngf");
  
  driver.findElement(By.id("pass")).sendKeys("gjhgjhhjg");
  driver.findElement(By.name("pass")).sendKeys("tytuytygyg");
  
  driver.findElement(By.tagName("button")).click();
  
	}
	

}
