package com.hooks.nithish;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.nithish.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	@After
	public void teardown(Scenario sc) {
		Implicit_Wait(30);

				if(sc.isFailed()) {  
				    TakesScreenshot ts= (TakesScreenshot)driver;
				    byte[] scr= ts.getScreenshotAs(OutputType.BYTES);
				    sc.attach(scr, "image/jpg", "ss_hooks");
				}else {
					TakesScreenshot ts= (TakesScreenshot)driver;
				    byte[] scr= ts.getScreenshotAs(OutputType.BYTES);
				    sc.attach(scr, "image/jpg", "ss_hooks");
				}
					
		Implicit_Wait(50);
		System.out.println("All work completed ");
		Close_Browser();
	}
	

}
