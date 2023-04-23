package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		
         driver.get("https://www.facebook.com");
         
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sdfsdf");
        WebElement password = driver.findElement(By.id("pass"));
         password.sendKeys("yjygjgyj");
          WebElement loginbutton = driver.findElement(By.name("login"));
          loginbutton.click();
        

	}

}
