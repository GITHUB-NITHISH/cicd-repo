package com.nithishTest.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.nithish.appium.SuperClass;

import io.appium.java_client.android.AndroidDriver;

public class TapLongPress extends SuperClass{
	
	setup("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
	
	
	@Test(priority=2)
	private void prog() {
		
		WebElement views= driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		views.click();
		
		WebElement expandableList = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]"));
		expandableList.click();
		
		WebElement customAdaptorElement = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]"));
		customAdaptorElement.click();
		
		
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		Sequence sequence = new Sequence(finger, 1);
		
		sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), 202,287))
		   .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		   .addAction(new Pause(finger,Duration.ofMillis(3000)))
		   .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		   driver.perform(Arrays.asList(sequence));
	
	}

}
