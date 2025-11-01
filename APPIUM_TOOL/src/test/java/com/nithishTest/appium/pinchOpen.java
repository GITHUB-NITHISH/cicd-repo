package com.nithishTest.appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.nithish.appium.SuperClass;

public class pinchOpen extends SuperClass{
	
	@Test
	public static void pinchTest() throws MalformedURLException, InterruptedException {
		
		setup("com.google.android.apps.photos", "com.google.android.apps.photos.home.HomeActivity");
		
		WebElement photo = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Photo taken on 06-Aug-2023 11:07:56 pm\"]"));
		photo.click();

		Thread.sleep(2000);
			
		pinch(driver, 513, 1224,513, 1721,513,1123,513, 653);
		
		pinch(driver, 513, 1721, 513, 1224, 513, 653, 513,1123);
		
		Thread.sleep(2000);
	}

}
