package com.testrunner.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Welcome\\eclipse-workspace\\CUCUMBER_FRAMEWORK2\\src\\test\\java\\test.feature",glue="com.stepdefinition.com",
dryRun = true,
stepNotifications = true 
)

public class Runner {

	
}
