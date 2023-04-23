package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScotiaBankLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=6g5UnVnkdL8&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5nb29nbGUuY29tXC8iLCJvYXV0aF9rZXkiOiI2ZzVVblZua2RMOCIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvd3d3LnNjb3RpYW9ubGluZS5zY290aWFiYW5rLmNvbVwvb25saW5lXC9sYW5kaW5nXC9vYXV0aGxhbmRpbmcuYm5zIiwiZXhwIjoxNjU1NjU4MzMxLCJpYXQiOjE2NTU2NTcxMzEsImp0aSI6IjI4YjIyNTQ1LTM1MWItNDBhOS1iZDVlLWI3NGFlYzhiODc2ZSIsImNsaWVudF9pZCI6IjhlZTkwYzM5LTFjNTItNGZmNC04YWU2LWE3YjU0YzUzOTkzMyIsImNsaWVudF9tZXRhZGF0YSI6eyJDaGFubmVsSUQiOiJTT0wiLCJBcHBsaWNhdGlvbkNvZGUiOiJINyJ9LCJpc3N1ZXIiOiJodHRwczpcL1wvcGFzc3BvcnQuc2NvdGlhYmFuay5jb20ifQ.NKjqUPN8xXb20CdzGWPugFCP5HvClMq0mQcP57Unupq4RH9tIEA7ghzGLwCpHbiIUj5EtLBUJuTed-Ay8aKsxAuLluxPpyH3aZawNqb2LoUstmn9HihM7bDZg3qMCcPHk0dAl1kJPPdA-xYwsy3b7D9sgn_4Qo59pX9d5VcN295gLxn4IS6bdeuBQPaYdGNvPAcNVXz-rFl1HlEh4DZUv9HKJviUYcsMJQILY4L6gflsif1O1JoNzavKvPIsR0YDdnFhPgPLj9A5xYZ5hD5WYqvtw9WXq-X4KaELNAHOB5N115Rxd3pNrx4NYKSULRCC_ZEyUXPeEt7y3ajW74ck-Q&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("yjyjyh$%#");
		driver.findElement(By.name("password")).sendKeys("jhgjkgj");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);
		
		String expectedErr ="Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println("actualErr");
		
		if (expectedErr.equals(actualErr)) {
			System.out.println("pass");
		}else  {
			System.out.println("fail");
			
		}
		
		
		

	}

}
