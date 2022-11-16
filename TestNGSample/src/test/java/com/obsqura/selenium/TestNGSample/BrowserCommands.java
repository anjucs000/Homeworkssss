package com.obsqura.selenium.TestNGSample;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserCommands extends Base {
	@Test
	public void verifyTitle() {
		String actualTitle, actualURL, actualSource, expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		actualTitle = driver.getTitle(); // to get title of the site
		actualURL = driver.getCurrentUrl(); // to get actual url from site
		actualSource = driver.getPageSource();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@Test
	public void verifyURL() {
		String actualURL,expURL;
		actualURL=driver.getCurrentUrl();
		expURL="https://www.amazon.in/";
		Assert.assertEquals(expURL, actualURL);
	}
	//@Test
	/*public void navigateCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();// go to last page
		driver.navigate().forward(); // again go to the next page
		driver.navigate().refresh(); // to refresh page
	}*/
}
