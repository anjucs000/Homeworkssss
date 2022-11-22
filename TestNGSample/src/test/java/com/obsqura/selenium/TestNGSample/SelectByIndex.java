package com.obsqura.selenium.TestNGSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	}
	@Test
	public void selectByValue() {
			String inputText="Red";
			driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
			Select objselect=new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
			objselect.selectByValue(inputText);
			objselect.deselectByValue(inputText);//to deselect the selected value but it wont work here as it is not multiselect
			//actualMsg=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
	}
	@Test
	public void getOptionsMethod() {
		int count;
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		Select objselect=new Select(driver.findElement(By.xpath("//select[@id='single-input-field']")));
		List <WebElement> elementCount=objselect.getOptions();
		count=elementCount.size();
	}

}
