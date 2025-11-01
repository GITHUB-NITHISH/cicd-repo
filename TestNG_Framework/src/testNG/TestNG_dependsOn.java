package testNG;

import org.testng.annotations.Test;


public class TestNG_dependsOn {
	
	// if main test failed, depended methods are skipped
	
	@Test (dependsOnMethods="MethodTwo")
	public void MethodOne() {

		System.out.println("method 1" );
	}
	
	@Test 
	public void MethodTwo() {
		int a=8/0;
		System.out.println("method 2");
	}
	
	@Test 
	public void MethodThree() {
		System.out.println("Method 3");
	}

}
