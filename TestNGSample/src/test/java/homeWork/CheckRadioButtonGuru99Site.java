package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckRadioButtonGuru99Site extends DriverLoading {
	@Test
	public void checkRadioButtonsSelected() {
		WebElement radioButtonYes,radioButtonNo,resetButton,checkButton;
		Boolean isYesSelected,isNoSelected;
		String actualText = "",expectedText="Radio button is Not checked";
		SoftAssert softAssert = new SoftAssert();
		radioButtonYes=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		radioButtonNo=driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		resetButton=driver.findElement(By.xpath("//input[@type='reset']"));
		checkButton=driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		isYesSelected=radioButtonYes.isSelected();
		isNoSelected=radioButtonNo.isSelected();
		if(isYesSelected==false && isNoSelected==false) {
			checkButton.click();
			actualText=driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
		}
		softAssert.assertTrue(true, "One of the radio button is selected");
		softAssert.assertEquals(actualText, expectedText, "Actual and expected texts are not same");
		softAssert.assertAll();
		
	}
	@Test
	public void selectNoRadioButton() {
		WebElement radioButtonYes,radioButtonNo,resetButton,checkButton;
		Boolean isYesSelected,isNoSelected,flag=false;
		String actualText = "";
		String expectedText="Radio button is checked and it's value is No";
		SoftAssert softAssert = new SoftAssert();
		radioButtonYes=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		radioButtonNo=driver.findElement(By.xpath("(//input[@name='name'])[2]"));
		radioButtonNo.click();
		resetButton=driver.findElement(By.xpath("//input[@type='reset']"));
		checkButton=driver.findElement(By.xpath("//input[@id='buttoncheck']"));
		isYesSelected=radioButtonYes.isSelected();
		isNoSelected=radioButtonNo.isSelected();
		if(isYesSelected==false && isNoSelected==true) {
			flag=true;
			checkButton.click();
			actualText=driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
		}
		softAssert.assertTrue(flag, "No radio button is not selected");
		softAssert.assertEquals(actualText, expectedText, "Actual and expected texts are not same");
		softAssert.assertAll();
	}

}
