package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=HFb-YO-UuAs&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiJIRmItWU8tVXVBcyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU1MDY0OTI5LCJpYXQiOjE2NTUwNjM3MjksImp0aSI6IjM0MmZiYjFkLWEwZGYtNDgyNy05ZDg4LWE5OGNhOTRjNjBmMiIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.Z--ldfEzNWXwH3QiLdkzJxzDmT7HT0tm3OXLPKK7Ikukhlk4eEpcA3CHqSVk6GkhHCi6re0vyt80zlXR0KiMdEOZID55c6rLZfPLVMoTjDDM7BZlk267vJ6fQ2bkCOC3wppJk7k4cVUb8E7cZR2wNThuGj2PuLJ32cgNgF6ee5Fhy2riYvDEgSHpMAkIlCWQFjyTH6mR_QuMDanOr6IoZcYASSs7MWEbAJdCNU0liPYAyjOlcmXCLG7J06oVjB8btvi8Wa8MyC9-Mj0s_SoiWV-5mr4dH-VZAEANi2dhlBI07NcbXLGTRoMKvTQ4mlrCU53r2_AbiAIFg9DsoIJf7Q&preferred_environment=");
		  
		  //enter with special char - gdsgkdgdfkdfgdfdhdhjd#$%
		  //enter any wrong password
		  //click on SignIn button
		 
		 driver.findElement(By.id("usernameInput-input")).sendKeys("gdsgkdgdfkdfgdfdhdhjd#$%");
		 driver.findElement(By.name("password")).sendKeys("adsfsdggsdg234");
		 driver.findElement(By.id("signIn")).click();
		 
		 Thread.sleep(2000);
		 
		 String expectedErr = "Please enter a username or card number without special characters.";
		 String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		 System.out.println(actualErr);
		 
		 if(expectedErr.equals(actualErr)) {
			 System.out.println("Pass");
		 }else {
			 System.err.println("Fail");
		 }
		 
		  

	}

}
