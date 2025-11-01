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

public class TapCentre extends SuperClass{
	
	@Test(priority = 2)
	private void TapUsingCentre() throws MalformedURLException {
		
			// when element is not clickable becoz of any reasons ,so clicking centre of element
		
		setup("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
		
		WebElement TextElement = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
		Dimension size= TextElement.getSize();
		Point location = TextElement.getLocation();
		
		Point centreOfElement= getCentreOfElement(location,size);
		
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
		Sequence sequence = new Sequence(finger, 1);
		
		sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), centreOfElement))
		   .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		   .addAction(new Pause(finger,Duration.ofMillis(200)))
		   .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		   driver.perform(Arrays.asList(sequence));
		   
		   TearDown();
				
	}



	@Test(priority=2)
	private Point getCentreOfElement(Point location, Dimension size) {
		return new Point(location.getX()+size.getWidth()/2, location.getY()+size.getHeight()/2);
	}
}
