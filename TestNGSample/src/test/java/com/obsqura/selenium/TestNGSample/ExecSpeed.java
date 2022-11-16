package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExecSpeed extends Base {
	
	@Test(description="locate by ID")
	public void locateByID() {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}
	@Test(description="locate by xpath")
	public void locateByXpath() {
	driver.findElement(By.xpath("//div[@class='nav-search-field ']")).click();
	}
	@Test(description="locate by CSS selector tag and class")
	public void locateByCSSTagAndClass() {
		driver.findElement(By.cssSelector("div.nav-search-field ")).click();
	}
	@Test(description="locate by CSS selector tag and id")
	public void locateByCSSTagAndID() {
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
	}
	@Test(description="locate by CSS selector tag and attribute")
	public void locateByCSSTagAndAttribute() {
		driver.findElement(By.cssSelector("input[aria-label='Search']")).click();
	}
}
