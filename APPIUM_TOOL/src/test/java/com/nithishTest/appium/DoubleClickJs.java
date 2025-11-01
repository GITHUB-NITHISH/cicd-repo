package com.nithishTest.appium;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;
import com.nithish.appium.SuperClass;


public class DoubleClickJs extends SuperClass{
	
	@Test (enabled = false)
	public void Doubleclick() throws MalformedURLException {
		
		setup("com.google.android.apps.photos", "com.google.android.apps.photos.home.HomeActivity");
		
		WebElement pic = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on 12-Aug-2023 9:50:35 am\"]"));
		pic.click();
		
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");  
		Sequence sequence = new Sequence(finger, 1);
		
		sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), 501,1243))
		   .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		   .addAction(new Pause(finger,Duration.ofMillis(200)))
		   .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
		   .addAction(new Pause(finger,Duration.ofMillis(200)))
		   .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		   .addAction(new Pause(finger,Duration.ofMillis(200)))
		   .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		   driver.perform(Arrays.asList(sequence));
		
	}
	

	@Test (enabled = true)
	public void Doubleclickjs() throws MalformedURLException {
		
		setup("com.google.android.apps.photos", "com.google.android.apps.photos.home.HomeActivity");
		
		WebElement pic = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on 12-Aug-2023 8:11:54 am\"]"));
		pic.click();
		
		WebElement photo = driver.findElement(By.id("com.google.android.apps.photos:id/video_player_controller_fragment_container"));
		
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) photo).getId(),
				"percent", .9
				));
		
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) photo).getId(),
				"percent", .9
				));
		
	}
	
	// PinchClose
	
	/*  ((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) photo).getId(),
				"percent", .9
				));  */

}
