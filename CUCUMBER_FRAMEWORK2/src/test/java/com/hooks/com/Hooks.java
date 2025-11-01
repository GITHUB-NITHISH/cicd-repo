package com.hooks.com;

import org.testng.annotations.BeforeTest;

import com.base.com.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before
	public void setup() {
		Launch_Browser("chrome");
		Maximize_Window();
		Implicit_Wait(3000);
	}
	
	@After
	public void teardown() {
		Implicit_Wait(3000);
		Close_Browser();
	}
	

}
