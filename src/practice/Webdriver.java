package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver();
     WebDriver driver = new ChromeDriver();
     
   driver.get("https://www.facebook.com");
   driver.findElement(By.id("email")).sendKeys("yiuytu");
   driver.findElement(By.id("pass")).sendKeys("dfdf");
   driver.findElement(By.name("login")).click();
   
	}

	}


