package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest1 {
	public static WebDriver driver;

	public static void main(String[] args) {
	
		
	Xls_Reader d = new Xls_Reader("C:\\Users\\USER\\Desktop\\QA\\NikulTest.xlsx");
		
    String browser = "Firefox"; //Chrome, Safari //Read this value from data file, Excel, Properties,..
		
	System.out.println(d.getCellData("Data", "Name", 3));
    String correctEmail = d.getCellData("Data1", 1, 2);
	System.out.println(correctEmail); 
	
	//String web = d.getCellData("Data1", "Browser", 2);
	//System.out.println(web); 

	System.out.println(d.getRowCount("Data1"));
	System.out.println(d.getColumnCount("Data1"));
	
	d.setCellData("Data1", "Name", 11, "testing11");
	System.out.println(d.getCellData("Data1", "Name", 11));
	System.out.println(d.getRowCount("Data1")); //11
	
	d.addColumn("Data1", "Nikul");
	System.out.println(d.getColumnCount("Data1")); //8
	
	if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\geckodriver.exe");
        driver = new FirefoxDriver(); 	
	}else if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
	}else {
		//System.setProperty("webdriver.safari.driver", "");
		//SafariDriver driver = new SafariDriver();
	}	
		

	}

}
