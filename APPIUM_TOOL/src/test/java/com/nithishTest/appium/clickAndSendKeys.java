package com.nithishTest.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.nithish.appium.SuperClass;

import io.appium.java_client.android.AndroidDriver;

public class clickAndSendKeys extends SuperClass{
	
	@Test (priority=2)
	private void appAutomation() throws MalformedURLException {
		
		setup("io.selendroid.testapp", ".HomeScreenActivity");
	
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click(); 
		driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("Nithish kumar");
		driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("dsnithish@gmail.com");
		driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("password");
		WebElement name = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		name.clear();
		name.sendKeys("Nithish");
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[3]")).click();
		driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
	
		driver.hideKeyboard();
		
		driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
		
	
	}
}
