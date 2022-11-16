package com.obsqura.selenium.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElementsSample extends Base {
	@Test
	public void findElementsMethod() {
		List<WebElement> menuItems=driver.findElements(By.xpath("//li[@class='list-group-item']"));
	}

}
