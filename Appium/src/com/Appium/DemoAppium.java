package com.Appium;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class DemoAppium {
	
	public static AndroidDriver driver;
	
	@Test
	private void AppLaunch() throws MalformedURLException {
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("udid", "ROLVYXORYD7DKVWK");
		capabilities.setCapability("deviceName", "Redmi Note 11s");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		
//		URL url= new URL("0.0.0.0:4723/wd/hub");
//		driver= new AndroidDriver(url,capabilities);
	}
	

}
