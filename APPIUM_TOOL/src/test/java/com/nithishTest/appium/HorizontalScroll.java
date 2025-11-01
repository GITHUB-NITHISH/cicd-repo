package com.nithishTest.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.nithish.appium.SuperClass;

import io.appium.java_client.android.AndroidDriver;

public class HorizontalScroll extends SuperClass {
	 
    @Test(priority = 2)
	public static void Horizontal() throws MalformedURLException {
    	
    	setup("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
    	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(By.id("android:id/button1")).click();
    	WebElement views = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
    	views.click();
    	
    	WebElement gallery = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Gallery\"]"));
    	gallery.click();
    	
    	WebElement photos = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]"));
    	photos.click();
    	
    	for (int i=0; i<2; i++) {
    		scrollCoordinates(driver, 956, 395, 47, 373);
    	}
    	
 
    }
}
