package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectFromDropdown extends Base{
	@Test
	public void dropDownSelection() {
		String inputText="Red",expectedMsg="Selected Color : "+inputText;
		String actualMsg;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect=new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objselect.selectByVisibleText(inputText);
		actualMsg=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMsg, expectedMsg, inputText+" is not selected");
	}

}
