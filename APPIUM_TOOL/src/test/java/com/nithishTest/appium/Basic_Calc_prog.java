package com.nithishTest.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Basic_Calc_prog {
	
	public static AndroidDriver driver;
	@Test (priority =0)
	private void setCapabilities() throws MalformedURLException {
	
	DesiredCapabilities capabilities = new DesiredCapabilities();   
	
	capabilities.setCapability("appium:automationName", "UiAutomator2");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "13");
	capabilities.setCapability("udid", "ROLVYXORYD7DKVWK");
	capabilities.setCapability("deviceName", "NICKIE");
    capabilities.setCapability("appPackage", "com.google.android.calculator");
	capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
   
    URL  url = new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AndroidDriver(url, capabilities);

	}
	
	@Test (priority=1)
	private void Demo() {
		
		// (10/2 * 30 +5 -6)^2 -(100/50*2 +7 -8)^4
		
		String expected = "22120";  
		
		WebElement para= driver.findElement(AppiumBy.accessibilityId("left or right parenthesis"));
		para.click();
		
		List<WebElement> one = driver.findElements(AppiumBy.className("android.widget.ImageButton"));
		one.get(17).click();
		
		WebElement zero = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"0\"]"));
		zero.click();
		
		WebElement divide = driver.findElement(By.id("com.google.android.calculator:id/op_div"));
		divide.click();
		
		WebElement two = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		two.click();
		
		WebElement multiply = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
	    multiply.click();
		
		WebElement three = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
		three.click();
		
		zero.click();
		
		WebElement add = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		add.click();
		
		WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		five.click();
		
		WebElement sub = driver.findElement(By.id("com.google.android.calculator:id/op_sub"));
		sub.click();
		
		WebElement six = driver.findElement(By.id("com.google.android.calculator:id/digit_6"));
		six.click();
		
		para.click();
		
		WebElement power = driver.findElement(By.id("com.google.android.calculator:id/op_pow"));
		power.click();
		
		two.click();
		
		sub.click();
		
		para.click();
		
		one.get(17).click();
		
		zero.click();
		
		zero.click();
		
		divide.click();
		
		five.click();
		
		zero.click();
		
		multiply.click();
		
		two.click();
		
		add.click();
		
		WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
		seven.click();
		
		sub.click();
		
		WebElement eight = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
		eight.click();
		
		para.click();
		
		power.click();
		
		
		WebElement four = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
		four.click();
		
		WebElement answer = driver.findElement(By.id("com.google.android.calculator:id/result_preview"));
	    String actual = answer.getText();
	    
	    Assert.assertEquals(actual, expected);
		
		
		

	}

}
