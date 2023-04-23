package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultiplebrowserTest2 {   //read date from properties file and copy the code from multiple browser test
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
	
	String browser = "Chrome"; //Chrome, Safari //Read this value from data file, Excel, Properties,..
	FileInputStream f = new FileInputStream("C:\\Users\\USER\\Desktop\\QA\\prop.properties");
    Properties prop = new Properties();
    prop.load(f);
    //String browser = prop.getProperty("browser");
    //System.out.println(browser);
    System.out.println(prop.getProperty("browser"));
    
    String email = prop.getProperty("correctEmail");
    System.out.println(email);
    System.out.println(prop.getProperty("url"));
    System.out.println(prop.getProperty("tool"));
    System.out.println(prop.getProperty("incorrectemail"));
    
    prop.setProperty("defect", "Jira");
    System.out.println(prop.getProperty("defect"));
    
    prop.setProperty("language", "Java");
    System.out.println(prop.getProperty("language"));

	if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
        driver = new FirefoxDriver(); 	
	}else if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
	}else {
		
	}
	
	/*driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("hjkhsdkjhsdkhsdk");
	driver.findElement(By.id("pass")).sendKeys("sdljgdksgff");
	driver.findElement(By.id("login")).click();*/
	

}
}