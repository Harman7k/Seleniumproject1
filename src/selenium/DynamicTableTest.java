package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//get no. of rows and columns and read this data(read nested loop)
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> cln = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(cln.size());                                              //tr[2]/td - sir used  
		for(int i=2; i<=rows.size(); i++) {
			
			for(int j=1; j<=cln.size(); j++) {
				//System.out.println(i+"-----"+j);
		//System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[i]/td[j]")).getText()); - will give unable to locate	
System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
			System.out.println(" | ");
		}
		System.out.println();
	}
	}
}
