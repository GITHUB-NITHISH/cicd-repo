package com.nithish.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SuperClass {

	public static AndroidDriver driver;

  
	public static void setup(String appPackage,String appActivity) throws MalformedURLException {
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	capabilities.setCapability("appium:automationName", "UiAutomator2");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "13");
	capabilities.setCapability("udid", "ROLVYXORYD7DKVWK"); 
	capabilities.setCapability("deviceName", "NICKIE");
//	capabilities.setCapability("noReset","true");
//	capabilities.setCapability("fullReset", "false");
    capabilities.setCapability("appPackage", appPackage);
	capabilities.setCapability("appActivity", appActivity);
   
    URL  url = new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AndroidDriver(url, capabilities);

	}
    
    
	public static void scrollCoordinates(AndroidDriver driver,int startX,int startY,int endX,int endY) {
		
			
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
			
	
			Sequence sequence = new Sequence(finger, 1);
			
			sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), startX,startY));
			sequence.addAction(finger.createPointerDown(0));
			sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), endX,endY));
			sequence.addAction(finger.createPointerUp(0));

			driver.perform(Arrays.asList(sequence));
	}
	
	public static void pinch(AndroidDriver driver,int startX,int startY,int endX,int endY,int startX2,int startY2,int endX2,int endY2 ) {
		
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		
		
		Sequence sequence = new Sequence(finger, 1);
		
		sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), startX,startY));
		sequence.addAction(finger.createPointerDown(0));
		sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), endX,endY));
		sequence.addAction(finger.createPointerUp(0));

		
		PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH,"finger2");
		
		Sequence sequence2 = new Sequence(finger2, 1);
		
		sequence2.addAction(finger2.createPointerMove(Duration.ofMillis(0), Origin.viewport(), startX2,startY2));
		sequence2.addAction(finger2.createPointerDown(0));
		sequence2.addAction(finger2.createPointerMove(Duration.ofMillis(500), Origin.viewport(), endX2,endY2));
		sequence2.addAction(finger2.createPointerUp(0));

		
		driver.perform(Arrays.asList(sequence,sequence2));
	}
    
  
	public static void AndroidUiautomator(String textName) throws MalformedURLException {
		
	WebElement uiautomator = driver.findElement(new AppiumBy.ByAndroidUIAutomator
			("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\textName).instance(0))"));
		
	uiautomator.click();
	}
	
    public static void TearDown() {
    	
    	if(driver!=null) {
    		driver.quit();
    	}
    }
	
	
}
