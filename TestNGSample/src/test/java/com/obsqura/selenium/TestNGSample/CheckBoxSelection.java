package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxSelection extends Base {
	@Test
	public void checkBoxMethod() {
		String expText="Success - Check box is checked",actText;
		Boolean selected;
		WebElement checkBox;
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		selected=checkBox.isEnabled();
		if(selected==false) {
			checkBox.click();
			if(checkBox.isSelected()) {
			actText=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			Assert.assertEquals(actText, expText);
			}
			Assert.assertTrue(false, "Checkbox is not selected");
		}
		Assert.assertTrue(true, "Checkbox is already clicked");
		
		
	}
	

}
