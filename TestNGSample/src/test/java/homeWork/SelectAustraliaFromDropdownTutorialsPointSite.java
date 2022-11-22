package homeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectAustraliaFromDropdownTutorialsPointSite extends DriverLoading{
	@Test
	public void selectAustralia() {
		String inputText="Australia",actualText;
		WebElement dropDown=driver.findElement(By.xpath("//select[@name='continents']"));
		Select objSelect=new Select(dropDown);
		objSelect.selectByVisibleText(inputText);
		actualText=objSelect.getFirstSelectedOption().getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, inputText, "Actual selected value is not equal to expected");
		
	}
	@Test
	public void printAllElement() {
		int totalCount;
		WebElement dropDown=driver.findElement(By.xpath("//select[@name='continents']"));
		Select objSelect=new Select(dropDown);
		List <WebElement> elementCount=objSelect.getOptions();
		totalCount=elementCount.size();
					for(int i=0;i<totalCount;i++) {
						System.out.println(elementCount.get(i).getText());
					}	
	}

}
