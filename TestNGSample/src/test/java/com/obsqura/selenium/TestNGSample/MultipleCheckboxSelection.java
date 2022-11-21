package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleCheckboxSelection extends Base {
	@Test
	public void multipleCheckboxSelection() {
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
		if(checkBox1IsSelected==false && checkBox2IsSelected==false && checkBox3IsSelected==false && checkBox4IsSelected==false) {
			if(selectButton.isEnabled()==true) {
				//selectButton.click();
				actualSelectedButtonText=selectButton.getText();
			}
			Assert.assertTrue(false, "Select button is disabled");
			Assert.assertEquals(actualSelectedButtonText, expectedSelectButtonText, "Select all button is showing as Unselect all ");
		}
		Assert.assertTrue(true, "One of the checkbox is selected");
	}
}
