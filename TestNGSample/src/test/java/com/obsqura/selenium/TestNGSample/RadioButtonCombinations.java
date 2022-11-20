package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonCombinations extends Base {
	
	@Test //no radiobuttons selected
	public void noRadioButtonsSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String expText="Gender :\nAge group:",ActText="";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==false && age1==false && age2==false && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		}
		Assert.assertEquals(ActText, expText);
	}
	@Test //Only male selected
	public void maleButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender Male:\nAge group:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//label[@for='inlineRadio11']"));
		male.click();
		radio1=male.isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==false && age2==false && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		}
		Assert.assertEquals(ActText, expText);
	}
	@Test
	public void femaleButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender Female:\nAge group:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement female=driver.findElement(By.xpath("//label[@for='inlineRadio21']"));
		female.click();
		radio2=female.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==false && age2==false && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		}
		
		Assert.assertEquals(ActText, expText);
	}
	@Test
	public void age1ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender :\\nAge group: 1 to 18:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age1Element=driver.findElement(By.xpath("//label[@for='inlineRadio22']"));
		age1Element.click();
		age1=age1Element.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==false && age1==true && age2==false && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		}
		Assert.assertEquals(ActText, expText);	

	}
	@Test
	public void age2ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender :\\nAge group: 19 to 44:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age2Element=driver.findElement(By.xpath("//label[@for='inlineRadio23']"));
		age2Element.click();
		age2=age2Element.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==false && age1==false && age2==true && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		
		Assert.assertEquals(ActText, expText);
	}
	@Test
	public void age3ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender :\\nAge group: 45 to 60:";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement age3Element=driver.findElement(By.xpath("//label[@for='inlineRadio24']"));
		age3Element.click();
		age3=age3Element.isSelected();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		if(radio1==false && radio2==false && age1==false && age2==false && age3==true) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		Assert.assertEquals(ActText, expText);
	}
	@Test
	public void MaleAndAge1ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Male\\nAge group: 1 to 18";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio11']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio22']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==true && age2==false && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		Assert.assertEquals(ActText, expText);
		
	}
	@Test
	public void MaleAndAge2ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Male\\nAge group: 19 to 44";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio11']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio23']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==false && age2==true && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		Assert.assertEquals(ActText, expText);
		
	}
	@Test
	public void MaleAndAge3ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Male\\nAge group: 45 to 60";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio11']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio24']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==true && radio2==false && age1==false && age2==false && age3==true) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		Assert.assertEquals(ActText, expText);
		
	}
	
	@Test
	public void FemaleAndAge1ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Female\\nAge group: 1 to 18";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio21']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio22']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==true && age2==false && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		Assert.assertEquals(ActText, expText);
		
	}
	@Test
	public void FemaleAndAge2ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Female\\nAge group: 19 to 44";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio21']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio23']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==false && age2==true && age3==false) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		Assert.assertEquals(ActText, expText);
	}
	@Test
	public void FemaleAndAge3ButtonSelected() {
		Boolean radio1,radio2,age1,age2,age3;
		String ActText="",expText="Gender : Female\\nAge group: 45 to 60";
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[@for='inlineRadio21']")).click();
		driver.findElement(By.xpath("//label[@for='inlineRadio24']")).click();
		radio1=driver.findElement(By.xpath("//label[@for='inlineRadio11']")).isSelected();
		radio2=driver.findElement(By.xpath("//label[@for='inlineRadio21']")).isSelected();
		age1=driver.findElement(By.xpath("//label[@for='inlineRadio22']")).isSelected();
		age2=driver.findElement(By.xpath("//label[@for='inlineRadio23']")).isSelected();
		age3=driver.findElement(By.xpath("//label[@for='inlineRadio24']")).isSelected();
		if(radio1==false && radio2==true && age1==false && age2==false && age3==true) {
			driver.findElement(By.xpath("//button[@id='button-two']")).click();
			ActText=driver.findElement(By.xpath("//div[@id='message-two']")).getText();	
		}
		Assert.assertEquals(ActText, expText);
		
	}

}
