package com.obsqura.selenium.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.testng.Assert;

public class FindElementsSample extends Base {
	@Test //finding the checkbox button and click on it
	public void findElementsMethod() {
		String expButton="Checkbox Demo",expURL="https://selenium.obsqurazone.com/check-box-demo.php",actURL;
		WebElement checkboxDemo;
		List<WebElement> menuItems=driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement menu:menuItems) {
			if(menu.getText().equals(expButton)) {
				checkboxDemo=menu;
				checkboxDemo.click();
				actURL=driver.getCurrentUrl();
				Assert.assertEquals(expURL, actURL);
				break;
			}
		}
	}
	@Test 
	public void datePickerMethod() {
		String button="Date Pickers",actualText;
		List<WebElement> items=driver.findElements(By.xpath("//li[@class='nav-item']//a"));
		for(WebElement selectItem:items) {
			actualText=selectItem.getText();
			if(actualText.contains(button)) {
				selectItem.click();
				Assert.assertTrue(true);
			}
		}
	}

}
