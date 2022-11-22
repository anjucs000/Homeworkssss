package homeWork;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverLoading {
	WebDriver driver;
	@BeforeMethod
	public void InitializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjuc\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.get("http://demo.guru99.com/test/ajax.html");
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
	
	}
	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}
}
