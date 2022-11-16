package com.obsqura.selenium.TestNGSample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertSample extends Base {
	@Test
	public void softAssertMethod() {
	String actualTitle, actualUrl, 
	expectedTitle = "Obsqura Testing",
	expectedURL = "https://selenium.obsqurazone.com/simple-form-demo.php";
	actualTitle = driver.getTitle(); 
	actualUrl = driver.getCurrentUrl();
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertEquals(actualUrl, expectedURL);
	softAssert.assertAll();
	}
}
