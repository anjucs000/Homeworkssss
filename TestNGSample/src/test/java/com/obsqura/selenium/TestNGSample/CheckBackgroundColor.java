package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckBackgroundColor extends Base {
	@Test
	public void checkBgColor() {
		String backGroundColor,expBgColor="rgba(0, 123, 255, 1)";
		backGroundColor=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("background-color");
		Assert.assertEquals(expBgColor, backGroundColor);
	}
	@Test
	public void checkTextColor() {
	String color,expColor="rgba(255, 255, 255, 1)";
	color=driver.findElement(By.xpath("//button[@id='button-one']")).getCssValue("color");
	if(expColor==color) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertFalse(false, "Actual and expected colors are different");
	}
	}
	/*@Test
	public void checkLocation() {
	Point location;
	int locationX,locationY;
	location=driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
	locationX=location.getX();
	locationY=location.getY();
	
	}*/
	@Test
	public void compareLocation() {
		Point locationA,locationB;
		int locationAY,locationBY;
		Boolean flag=false;
		locationA= driver.findElement(By.xpath("//button[@id='button-one']")).getLocation();
		locationAY=locationA.getY();
		locationB=driver.findElement(By.xpath("//div[@id='message-one']")).getLocation();
		locationBY=locationB.getY();
		if(locationBY>locationAY) {
			flag=true;
		}
		Assert.assertTrue(flag,"Show message button is located above Your Message field");
	}
	@Test
	public void getAttribute() {
		String className,tagName;
		Dimension sizeOfElement;
		Boolean elementEnable,display,selection;
		className=driver.findElement(By.xpath("//button[@id='button-one']")).getAttribute("class");
		tagName=driver.findElement(By.xpath("//button[@id='button-one']")).getTagName();
		sizeOfElement=driver.findElement(By.xpath("//button[@id='button-one']")).getSize();
		elementEnable=driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled();
		display=driver.findElement(By.xpath("//button[@id='button-one']")).isDisplayed();
		selection=driver.findElement(By.xpath("//button[@id='button-one']")).isSelected();
		
	}
	@Test
	public void checkFieldAndMessage() //check field is input field and show message is enabled
	{
		WebElement input;
		Boolean result,flag,flag1=false;
		String actualMessage;
		input=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		result=input.isEnabled();
		if(result==true) {
			input.sendKeys("Test");
		}
		else {
			System.out.println("Input field is not enabled");
		}
		flag=driver.findElement(By.xpath("//button[@id='button-one']")).isEnabled();
		if(flag==true) {
			driver.findElement(By.xpath("//button[@id='button-one']")).click();
			actualMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
			if(actualMessage.equals("Your Message : "+"Test")) {
				flag1=true;
			}
			Assert.assertTrue(flag1);
		}
	}
}
