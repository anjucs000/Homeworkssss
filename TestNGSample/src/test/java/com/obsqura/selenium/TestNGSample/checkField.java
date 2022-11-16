package com.obsqura.selenium.TestNGSample;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkField extends Base {
	@Test(priority=0)//(description="check if expected and actual sum are equal")
	public void checkSumOfNumbers() {
		int a=5,b=26,sum=a+b;
		String actualSum;
		String inputA=String.valueOf(a);
		String inputB=String.valueOf(b);
		String result="Total A + B : "+String.valueOf(sum);
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys(inputA);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(inputB);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		actualSum=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		Assert.assertEquals(result, actualSum);
	}
	@Test(priority=1)//(description="check result when numeric field entered with string")
	public void checkFieldAlphabets() {
		String alpha;
		driver.findElement(By.xpath("//input[@id='value-a']")).clear();
		driver.findElement(By.xpath("//input[@id='value-b']")).clear();
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys("B");
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		alpha=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		if(alpha.contains("NaN")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
	}


}
