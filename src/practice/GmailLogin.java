package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("gjhghjghghbghghg");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		 String expectedErr = "Couldn’t find your Google Account";
		 String actualErr = driver.findElement(By.className("LXRPh")).getText();
		 System.out.println(actualErr);
		 
		 
		 if(expectedErr.equals(actualErr)) {
			 System.out.println("pass");
		 }else {
			 System.out.println("fail");
		 }
		 
		 

	}

}
