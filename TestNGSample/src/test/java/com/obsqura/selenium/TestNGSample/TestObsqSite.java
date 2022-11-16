package com.obsqura.selenium.TestNGSample;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestObsqSite extends Base {
	@Test
	public void checkText() {
		String inputMessage = "hi Message!!!",actualMessage;
		Boolean flag=false;
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys(inputMessage);
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		if(actualMessage.equals("Your Message : "+inputMessage)) {
			flag=true;
		}
		Assert.assertTrue(flag);
		}
}
