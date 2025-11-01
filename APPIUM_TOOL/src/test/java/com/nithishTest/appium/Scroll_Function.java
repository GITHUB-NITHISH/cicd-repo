package com.nithishTest.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nithish.appium.SuperClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Scroll_Function extends SuperClass{


	
	@Test(priority=2)
	public void scroll() throws MalformedURLException {
		
			setup("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
		
			List<WebElement> views = driver.findElements(By.id("android:id/text1"));
			views.get(10).click();
			
			PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
			
			for(int i=0; i<2; i++) {
			Sequence sequence = new Sequence(finger, 1);
			
			sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), 517,2051));
			sequence.addAction(finger.createPointerDown(0));
			sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 517,326));
			sequence.addAction(finger.createPointerUp(0));

			   driver.perform(Arrays.asList(sequence));
			}
			
			TearDown();
	}	
	
	
	@Test(priority = 3)
	public static void AndroidUiautomator() throws MalformedURLException {
	
		setup("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
		
		List<WebElement> views = driver.findElements(By.id("android:id/text1"));
		views.get(10).click();
	
	    driver.findElement(new AppiumBy.ByAndroidUIAutomator
			("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"Tabs\").instance(0))"));
	
		List<WebElement> tabs = driver.findElements(By.id("android:id/text1"));
		tabs.get(9).click();
		
		TearDown();
	}
	
	
	
}
