package testNG;

import org.testng.annotations.Test;

public class TestNg_invocationCount {

	
	
	@Test
	public void M1() {
		System.out.println("M1");
	}
	
	@Test
	public void M2() {
		System.out.println("M2");
	}
	
	@Test (invocationCount=4)
	public void M3() {
		System.out.println("M3");
	}
	
	@Test (invocationCount=2)
	public void M4() {
		System.out.println("M4");
	}
	
	@Test
	public void M5() {					
		System.out.println("M5");
	}
	
}
