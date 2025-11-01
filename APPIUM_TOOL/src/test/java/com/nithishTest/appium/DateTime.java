package com.nithishTest.appium;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.nithish.appium.SuperClass;

import io.appium.java_client.AppiumBy;

public class DateTime extends SuperClass{
	
	@Test
	private void meth() throws MalformedURLException, InterruptedException {
		
		setup("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
		
		WebElement continueButton = driver.findElement(By.xpath("com.android.permissioncontroller:id/continue_button"));
		continueButton.click();
		
		WebElement okayButton = driver.findElement(By.xpath("android:id/button1"));
		okayButton.click();
		
		WebElement views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
		views.click();
		
		WebElement datewidget = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Date Widgets\"]"));
		datewidget.click();
		
		WebElement dialog = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Dialog\"]"));
		dialog.click();
		
		WebElement date = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"change the date\"]"));
		date.click();
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("android:id/date_picker_header_year"));
		year.click();
		
		Thread.sleep(2000);
		
		for(int i=0; i<3 ; i++) {
			scrollCoordinates(driver, 540, 699, 536, 1527);
		}
		
		// year
		WebElement myyear = driver.findElement(new AppiumBy.ByAndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"1998\").instance(0))"));
		myyear.click();
		
		//month
		for(int i=0;i<3;i++) {
			WebElement month = driver.findElement(By.id("android:id/next"));
			month.click();
		}
	
		//Day
		WebElement day = driver.findElement(new AppiumBy.ByAndroidUIAutomator
				("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"4\").instance(0))"));
		day.click();
		
		WebElement okay = driver.findElement(By.id("android:id/button1"));
		okay.click();
		
		
		// Time
		
		WebElement changeTime = driver.findElement(By.id("io.appium.android.apis:id/pickTime"));
		changeTime.click();
		
		Thread.sleep(2000);
		
		WebElement hour = driver.findElement(AppiumBy.accessibilityId("8"));
		hour.click();
		
		WebElement minute = driver.findElement(AppiumBy.accessibilityId("35"));
		minute.click();
		
		driver.findElement(By.id("android:id/button1")).click();
		
		String dateTime = driver.findElement(By.id("io.appium.android.apis:id/dateDisplay")).getText();
		String expectedDateTime = "11-4-1998 08:35";
		Assert.assertEquals(dateTime, expectedDateTime);
		
	}

}
