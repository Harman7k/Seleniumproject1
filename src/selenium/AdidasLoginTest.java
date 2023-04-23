package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
  Thread.sleep(2000);
	//enter wrong email
	//etner wrong pass
	//click on signIn button
	//Thread.sleep(4000); - mention here
	//verify error message

	
driver.findElement(By.id("login-email")).sendKeys("tuyjtyhghvhn"); 
driver.findElement(By.id("login-password")).sendKeys("43543ghfhfvgnv");
driver.findElement(By.xpath("//span[contains(text(),'Email Log in')]")).click(); //buttons[@type='submit']
Thread.sleep(4000);

  String ExpectedErr = "The email address is invalid."; //'your request timed out - please retry
  String ActualErr = driver.findElement(By.xpath("//div[@class='gl-form-hint gl-form-hint--error']")).getText();
  System.out.println(ActualErr);                   //div[@data='data auto id login errr msg--]
 
  if(ExpectedErr.equals(ActualErr)) {
	  System.out.println("Pass");
  }else {
	  System.out.println("Fail"); ////div[@class='gl-form-hint gl-form-hint--error']
  }
	 ////div[contains(text(),'Please enter a valid e-mail address')]")).getText();
  
  /*driver.findElement(By.id("login-email")).sendKeys("sdgsdgahgc@sgsdfg.com");
	driver.findElement(By.id("login-password")).sendKeys("dzgfhbfzgbzxb");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(6000);

	String exptecErr = "Your request timed out – please retry";
	String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
	System.out.println(actualErr);
	
	if(exptecErr.equals(actualErr)) {
		System.out.println("passed");
	}else {
		System.out.println("failed");
	}*/

	}
  
	}


