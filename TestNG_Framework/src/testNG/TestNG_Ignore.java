package testNG;

import org.testng.annotations.Test;

import org.testng.annotations.*;

public class TestNG_Ignore {

	@Ignore
	@Test 
	public void M1() {
		System.out.println("m1");
	}
	@Test
	public void M11() {
		System.out.println("m11");
	}
	
	@Test(enabled =false)
	public void M7() {
		System.out.println("m7");
	}
	
	@Test
	public void M9() {
		System.out.println("m9");
	}
	
	@Test
	public void M13() {					
		System.out.println("m13");
	}
	
	@Test
	public void M5() {					
		System.out.println("m5");
	}
	
	@Test 
	public void M3() {
		System.out.println("m3");
	}
	
	
	
	
}
