package com.testrunner.nithish;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\java\\nithish.feature",glue={"com.stepdefinition.nithish","com.hooks.nithish"},
	dryRun = false,
	stepNotifications = true,
	publish = true,
	monochrome = true,
	plugin = {"pretty","html:Reports\\htmlreport1.html",
						"json:Reports\\jsonreport1.json",
						"junit:Reports\\junitreport1.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

	public class Runner {

		
	}
	
