package com.nithishTest.appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import com.nithish.appium.SuperClass;

public class Decathlon_OTP extends SuperClass {
		
	@Test(enabled = false)
	private void OTP_notification() throws MalformedURLException, InterruptedException {
		
		setup("com.evamall.evacustomer", ".splash.SplashActivity");
		
		Thread.sleep(5000);
		driver.findElement(By.id("com.evamall.evacustomer:id/edtPhoneEmail")).sendKeys("8667803654");
		driver.findElement(By.id("com.evamall.evacustomer:id/txvGetOtp")).click();
		
		Thread.sleep(3000);
	
		driver.openNotifications();
		
		String otp = driver.findElement(By.xpath("//*[matches(@text,'Your login OTP')]")).getText();
		System.out.println(otp);
		
		String substring = otp.substring(32,36);
		System.out.println(substring);
		
		String first = String.valueOf(substring.charAt(0));
		String second = String.valueOf(substring.charAt(1));
		String third = String.valueOf(substring.charAt(2));
		String fourth = String.valueOf(substring.charAt(3));
		
		driver.findElement(By.id("com.android.systemui:id/dismiss_view")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView1")).sendKeys(first);
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView2")).sendKeys(second);
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView3")).sendKeys(third);
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView4")).sendKeys(fourth);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.evamall.evacustomer:id/txvSubmit")).click();
		
				
	}
	
	@Test(enabled = true)
	private void OTP_message() throws MalformedURLException, InterruptedException {
		
		setup("com.evamall.evacustomer", ".splash.SplashActivity");
		
		Thread.sleep(5000);
		driver.findElement(By.id("com.evamall.evacustomer:id/edtPhoneEmail")).sendKeys("8667803654");
		driver.findElement(By.id("com.evamall.evacustomer:id/txvGetOtp")).click();
		
		Thread.sleep(3000);
	
		driver.executeScript("mobile:startActivity", ImmutableMap.of("intent",
				"com.google.android.apps.messaging/com.google.android.apps.messaging.main.MainActivity"));
		
		Thread.sleep(3000);
		String otp = driver.findElement(By.xpath("//*[matches(@text,'Your login OTP')]")).getText();
		System.out.println(otp);
		
		String substring = otp.substring(32,36);
		System.out.println(substring);
		
		String first = String.valueOf(substring.charAt(0));
		String second = String.valueOf(substring.charAt(1));
		String third = String.valueOf(substring.charAt(2));
		String fourth = String.valueOf(substring.charAt(3));
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView1")).sendKeys(first);
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView2")).sendKeys(second);
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView3")).sendKeys(third);
		driver.findElement(By.id("com.evamall.evacustomer:id/otpView4")).sendKeys(fourth);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.evamall.evacustomer:id/txvSubmit")).click();
		

	}
	
	
}
