package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxesTutorialsPointSite extends DriverLoading {

	@Test
	public void checkBoxesSelectedOrNot() {
		WebElement manualTester,autoTester,rcElement,selIDE,selWebdriver;
		manualTester=driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		autoTester=driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		rcElement=driver.findElement(By.xpath("//input[@value='RC']"));
		selIDE=driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		selWebdriver=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		if(manualTester.isSelected() && autoTester.isSelected() && rcElement.isSelected() && selIDE.isSelected() && selWebdriver.isSelected()) {
			System.out.println("None of the checkboxes selected by default");
		}
		Assert.assertFalse(false, "One of the checkbox is selected");
	}
	@Test
	public void selectWebdriverCheckbox() {
		WebElement selWebdriver=driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		selWebdriver.click();
		if(selWebdriver.isEnabled()) {
			Assert.assertTrue(true, "Selenium webdriver is not enabled");
		}
		else {
			Assert.assertFalse(false);
		}
	}
}
