package com.Hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	@Before
	public void Test(Scenario sc) throws IOException {
		Launch();
	}
	
	@After
	public void cleanup(Scenario sc) throws InterruptedException {
		Waits(2000);
		AttachScreenshot(sc);
		System.out.println("Finish");
	}
	

}
