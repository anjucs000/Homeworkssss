import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.obsqura.selenium.TestNGSample.Base;

public class FormSubmitObsqSite extends Base {
	@Test
	public void subForm() {
	Boolean flag1,flag=false;
	String inputMsg,expMsg="Form has been submitted successfully!";
	driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
	driver.findElement(By.xpath("//input[@id='validationCustom01']")).sendKeys("Anju");
	driver.findElement(By.xpath("//input[@id='validationCustom02']")).sendKeys("CS");
	driver.findElement(By.xpath("//input[@id='validationCustomUsername']")).sendKeys("anjucs");
	driver.findElement(By.xpath("//input[@id='validationCustom03']")).sendKeys("Trivandrum");
	driver.findElement(By.xpath("//input[@id='validationCustom04']")).sendKeys("Kerala");
	driver.findElement(By.xpath("//input[@id='validationCustom05']")).sendKeys("690000");
	driver.findElement(By.xpath("//input[@id='invalidCheck']")).click();
	flag1=driver.findElement(By.xpath("//input[@id='invalidCheck']")).isSelected();
	if(flag1==true) {
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
	inputMsg=driver.findElement(By.xpath("//div[@class='my-2']")).getText();
	if(expMsg.equals(inputMsg)) {
	flag=true;
	}
	Assert.assertTrue(flag);
	}
}
