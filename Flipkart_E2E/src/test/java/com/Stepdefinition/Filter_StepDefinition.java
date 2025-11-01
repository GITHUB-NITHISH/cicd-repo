package com.Stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;

import com.Base.BaseClass;
import com.Pages.FilterPage;
import com.Pages.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Filter_StepDefinition extends BaseClass{
	FilterPage fp = new FilterPage(driver);
	
	@And("Select minimum and maximum price")
	public void select_minimum_and_maximum_price() throws InterruptedException   {
		
		String BeforeFilter = driver.findElement(By.xpath("//div[@class='col col-7-12']")).getText();
		System.out.println("Before filter :" + BeforeFilter);
	    fp.Min_Method();
	    Waits(2000);
	    fp.Max_Method();
	    Waits(2000);
	 
	}

	@And("Select brand")
	public void select_brand() throws InterruptedException   {
	   Waits(2000);
	   fp.Brand_Method();
	   Waits(2000);
	

	}

	@And("Select Ram")
	public void select_ram() throws InterruptedException  {
		Waits(2000);
	  fp.Ram_Method();
	  Waits(2000);

	}

	@And("Select battery capacity")
	public void select_battery_capacity() throws InterruptedException {
		Waits(2000);
	   fp.Battery_Method();

	}

	@Then("It should display relavant result")
	public void it_should_display_relavant_result() throws InterruptedException {
		System.out.println("*****************************");
		String AfterFilter = driver.findElement(By.xpath("//div[@class='col col-7-12']")).getText();
		System.out.println("Afterr filter :" + AfterFilter);
		

	}
	
	

}
