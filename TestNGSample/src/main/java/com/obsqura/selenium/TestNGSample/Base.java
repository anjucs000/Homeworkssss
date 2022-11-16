package com.obsqura.selenium.TestNGSample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Base {
	public WebDriver driver;
	
	@BeforeTest
	public void initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); //to maximise the window size
	}
	@AfterTest
	public void browserClose() {
		driver.close();
	}
	public void driverQuit() {
		driver.quit();
	}
	}

