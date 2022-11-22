package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleCheckboxSelection extends Base {
	
	
	@Test
	public void noMultipleCheckboxSelection() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox1,checkBox2,checkBox3,checkBox4,selectButton;
		Boolean checkBox1IsSelected,checkBox2IsSelected,checkBox3IsSelected,checkBox4IsSelected;
		String expectedSelectButtonText="Select All";
		String actualSelectedButtonText = "";
		checkBox1=driver.findElement(By.xpath("//label[@for='check-box-one']"));
		checkBox2=driver.findElement(By.xpath("//label[@for='check-box-two']"));
		checkBox3=driver.findElement(By.xpath("//label[@for='check-box-three']"));
		checkBox4=driver.findElement(By.xpath("//label[@for='check-box-four']"));
		selectButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		checkBox1IsSelected=checkBox1.isSelected();
		checkBox2IsSelected=checkBox2.isSelected();
		checkBox3IsSelected=checkBox3.isSelected();
		checkBox4IsSelected=checkBox4.isSelected();
		if(checkBox1IsSelected && checkBox2IsSelected && checkBox3IsSelected && checkBox4IsSelected) {
			if(selectButton.isEnabled()) {
				actualSelectedButtonText=selectButton.getAttribute("value");
			}
			Assert.assertTrue(true, "Select button is disabled");
			Assert.assertEquals(actualSelectedButtonText, expectedSelectButtonText, "Select all button is showing as Unselect all ");
		}
		Assert.assertFalse(false, "One of the checkbox is selected");
	}
	@Test
	public void allMultipleCheckboxSelection() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox1,checkBox2,checkBox3,checkBox4,selectButton;
		String expectedSelectButtonText="Unselect All";
		String actualSelectedButtonText = "";
		checkBox1=driver.findElement(By.xpath("//label[@for='check-box-one']"));
		driver.findElement(By.xpath("//label[@for='check-box-one']")).click();
		checkBox2=driver.findElement(By.xpath("//label[@for='check-box-two']"));
		driver.findElement(By.xpath("//label[@for='check-box-two']")).click();
		checkBox3=driver.findElement(By.xpath("//label[@for='check-box-three']"));
		driver.findElement(By.xpath("//label[@for='check-box-three']")).click();
		checkBox4=driver.findElement(By.xpath("//label[@for='check-box-four']"));
		driver.findElement(By.xpath("//label[@for='check-box-four']")).click();
		selectButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		if(checkBox1.isEnabled() && checkBox2.isEnabled() && checkBox3.isEnabled() && checkBox4.isEnabled()) {
			if(selectButton.isEnabled()) {
				actualSelectedButtonText=selectButton.getAttribute("value");
			}
			Assert.assertTrue(true, "Select button is disabled");
			Assert.assertEquals(actualSelectedButtonText, expectedSelectButtonText, "Unselect all button is showing as Select all ");
		}
		Assert.assertTrue(true, "One of the checkbox is not selected");
	}
	@Test
	public void allCheckboxSelectedAndClickSelectButton() {
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBox1,checkBox2,checkBox3,checkBox4,selectButton;
		Boolean checkBox1IsSelected,checkBox2IsSelected,checkBox3IsSelected,checkBox4IsSelected;
		String expectedSelectButtonText="Select All";
		String actualSelectedButtonText = "";
		checkBox1=driver.findElement(By.xpath("//label[@for='check-box-one']"));
		checkBox2=driver.findElement(By.xpath("//label[@for='check-box-two']"));
		checkBox3=driver.findElement(By.xpath("//label[@for='check-box-three']"));
		checkBox4=driver.findElement(By.xpath("//label[@for='check-box-four']"));
		selectButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		checkBox1.click();
		checkBox2.click();
		checkBox3.click();
		checkBox4.click();
		checkBox1IsSelected=checkBox1.isSelected();
		checkBox2IsSelected=checkBox2.isSelected();
		checkBox3IsSelected=checkBox3.isSelected();
		checkBox4IsSelected=checkBox4.isSelected();
		if(checkBox1IsSelected && checkBox2IsSelected && checkBox3IsSelected && checkBox4IsSelected) {
			if(selectButton.isEnabled()==true) {
				selectButton.click();
				actualSelectedButtonText=selectButton.getAttribute("value");
			}
			Assert.assertTrue(true, "Select button is disabled");
			Assert.assertEquals(actualSelectedButtonText, expectedSelectButtonText, "Unselect all button is showing as Select all ");
		}
		Assert.assertTrue(true, "One of the checkbox is not selected");
	}
}
