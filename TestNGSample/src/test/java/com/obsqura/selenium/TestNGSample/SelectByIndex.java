package com.obsqura.selenium.TestNGSample;

import java.util.List;
//select by index,select by value,multiselect programmes


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectByIndex extends Base{
	@Test
	public void selectDropdownByIndex() {
		String inputText="Red",expectedMsg="Selected Color : "+inputText;
		String actualMsg;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect=new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		objselect.selectByIndex(1);
		actualMsg=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		Assert.assertEquals(actualMsg, expectedMsg, "Actual and expected colors are different");
	}
	@Test
	public void selectByValue() {
			String inputText="Red",actualMsg,expectedMsg="Selected Color : "+inputText;;
			driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
			Select objselect=new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
			objselect.selectByValue(inputText);
			//objselect.deselectByValue(inputText);//to deselect the selected value but it wont work here as it is not multiselect
			actualMsg=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			Assert.assertEquals(actualMsg, expectedMsg, "Actual and expected colors using select by value are different");
	}
	@Test
	public void getOptionsMethod() {
		int count;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect=new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		List <WebElement> elementCount=objselect.getOptions();
		count=elementCount.size();
		Assert.assertNotNull(count, "The count is zero");
	}
	
	@Test
	public void multiSelectDropdown() {
		String actualText,expectedText;
		String value1,value2;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select obj=new Select(driver.findElement(By.xpath("//select[@id='multi-select-field']")));
		obj.isMultiple();
		obj.selectByIndex(1);
		obj.selectByIndex(2);
		driver.findElement(By.xpath("//button[@id='button-all']")).click();
		List <WebElement> values=obj.getOptions();
		value1=values.get(1).getText();
		value2=values.get(2).getText();
		expectedText="Selected Color : "+value1+value2;
		actualText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(actualText, expectedText, "Multiple selected dropdown values are not as expected");
		
	}
}
