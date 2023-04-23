package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
  driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
   driver.findElement(By.id("identifierId")).sendKeys("ghdgfhsdfhdfjhgfjhgdjhghdhjgf");
  driver.findElement(By.xpath("//span[text()='Next']")).click();
   Thread.sleep(3000);
   
   String expecteErr = "Couldn’t find your Google Account";
	String actualErr = driver.findElement(By.className("o6cuMc")).getText();
	System.out.println(actualErr);
	
	if(expecteErr.equals(actualErr)) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}

   
   

   
   
	}

}
