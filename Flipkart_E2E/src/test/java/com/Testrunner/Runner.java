package com.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions (	features = "src\\test\\resources\\Features\\Functionality.feature" , glue = {"com.Stepdefinition","com.Hooks"} ,
					plugin= { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} 	
				 )
public class Runner extends AbstractTestNGCucumberTests {

}
