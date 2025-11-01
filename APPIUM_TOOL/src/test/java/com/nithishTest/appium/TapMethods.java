package com.nithishTest.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.nithish.appium.SuperClass;

import io.appium.java_client.android.AndroidDriver;

public class TapMethods extends SuperClass{

	
	setup("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
	
//	@Test(priority=2)
//	private void tapUsingXY() {
//	
//	 //when no id,class,xpath for element, using x and y coordinates
//		
//		   PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
//		   Sequence sequence = new Sequence(finger, 1);
//
//		   sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), 113,987))
//		   .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
//		   .addAction(new Pause(finger,Duration.ofMillis(200)))
//		   .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//		   driver.perform(Arrays.asList(sequence));
//		  
//	}
//	

//	@Test(priority=2)
//	private Point getCentreOfElement(Point location, Dimension size) {
//		return new Point(location.getX()+size.getWidth()/2, location.getY()+size.getHeight()/2);
//	}
	
	
}
}
