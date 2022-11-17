package com.obsqura.selenium.TestNGSample;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations extends Base {
	@BeforeMethod
	public void beforeMethod() {
		//driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Anju");
		System.out.println("@BeforeMethod");
		//Assert.assertTrue(true);
	}
	@AfterMethod
	public void afterMethod() {
		//driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys("Kerala");
		System.out.println("@AfterMethod");
		//Assert.assertTrue(true);
	}
	@BeforeClass
	public void beforeClass() {
		//driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("CS");
		System.out.println("@BeforeClass");
		//Assert.assertTrue(true);
	}
	@AfterClass
	public void afterClass() {
		//driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys("Trivandrum");
		System.out.println("@afterClass");
		//Assert.assertTrue(true);
	}
	@BeforeTest
	public void beforeTest() {
		//driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("anjucs");
		System.out.println("@BeforeTest");
		//Assert.assertTrue(true);
	}
	@AfterTest
	public void afterTest() {
		//driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
		System.out.println("@AfterTest");
		//Assert.assertTrue(true);
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
		//driver.close();
		//Assert.assertTrue(true);
	}
	@Test
	public void testmethod() {
		System.out.println("Test");
		Assert.assertTrue(true);
	}
	
	

}
