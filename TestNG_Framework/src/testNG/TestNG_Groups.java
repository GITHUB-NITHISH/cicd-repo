package testNG;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class TestNG_Groups {
	
	@Test (groups= { "sanity1"})
	public void M1() {
		System.out.println("M1");
	}
	
	@Test (groups= {"sanity","sanitytest"})
	public void M2() {
		System.out.println("M2");
//		Reporter.log("Inside M2",true);
	}
	
	@Test 
	public void M3() {
		System.out.println("M3");
	}
	
	@Test 
	public void M4() {
		System.out.println("M4");
	}
	
	@Test (groups= {"sanity"})
	public void M5() {					
		System.out.println("M5");
	}
	
}
