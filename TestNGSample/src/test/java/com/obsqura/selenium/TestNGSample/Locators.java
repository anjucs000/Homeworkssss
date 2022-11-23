package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base {
	@Test(description="Locating by ID-amazon site search") 
	public void locatingByID() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12iphone 14 pro max case");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Test(description="Obsqura site testcase")
	public void locatingByClass() {
		driver.findElement(By.className("top-logo")).click();//took the classname and searched with that
	}
	@Test(priority=0)//(description="Amazon locating by class")
	public void locateClass() {
		driver.findElement(By.className("hm-icon-label")).click();
	}
	@Test(priority=1)
	public void locateByName() {
		driver.findElement(By.name("crid"));
	}
	@Test(priority=2)//(description="amzone site-tag and attribute")
	public void locateByCSS() {
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	}
	@Test(description="amzone site-Xpath")
	public void locateByCSSXpath() {
		driver.findElement(By.cssSelector("//input[@id='twotabsearchtextbox']"));
	}
	@Test(description="amzone site-Xpath by text")
	public void locateByCSSXpathByText() {
		driver.findElement(By.cssSelector("//input[@id='twotabsearchtextbox']"));
	}
	//************************************************
	
	@Test(description="Locating By CSS Selector(id) Select Your Address")
	public void locatingCSSSel() {
	driver.findElement(By.cssSelector("#glow-ingress-line2")).click();
	}
	@Test(description="Locating By CSS Selector(tag n id) Allv ")
	public void locatingCSSAll() {
	driver.findElement(By.cssSelector("div#nav-search-dropdown-card")).click();
	}
	@Test(description="Locating By CSS Selector(class) Cart To Deals")
	public void locatingCSSCartToDeals() {
	driver.navigate().to("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
	driver.findElement(By.cssSelector(".a-link-normal")).click();
	}
	@Test(description="Locating By CSS Selector(tag n class) Set Language")
	public void locatingCSSSetLang() {
	driver.navigate().to("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2Fref%3Dnav_logo&ref_=topnav_lang");
	driver.findElement(By.cssSelector("input.a-button-input")).click();
	}
	@Test(description="Locating By xpath Search bar")
	public void locatingXpathSearch() {
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
	@Test(description="Locating By xpath dir")
	public void locatingXpathdir() {
	driver.findElement(By.xpath("//input[@dir='auto']")).click();
	}
	@Test(description="Locating By xpath text")
	public void locatingXpathAll() {
	driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
	}
	@Test
	public void locateByLinkText() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.linkText("Simple Form Demo")).click(); //element by full link text
		driver.findElement(By.partialLinkText("Simple Form")).click();//getting element using partial text
	}

}
