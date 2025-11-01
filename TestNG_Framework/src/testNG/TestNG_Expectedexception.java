package testNG;

import org.testng.annotations.Test;


public class TestNG_Expectedexception {
	
	@Test (expectedExceptions = ArithmeticException.class)
	public void MethodOne() {
		
		int x=5/0;
		System.out.println(x);
		System.out.println("method 1" );
	}
	
	@Test
	public void MethodTwo() {
		System.out.println("method 2");
	}
	
	@Test
	public void MethodThree() {
		System.out.println("Method 3");
	}

}
