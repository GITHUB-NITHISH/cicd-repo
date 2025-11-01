package testNG;

import org.testng.annotations.Test;

public class TestNG_parallelTest {
	
	
	@Test 
	public void MethodOne() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("method 1" );
	}
	
	@Test 
	public void MethodTwo() {
		
		System.out.println("method 2");
	}
	
	@Test 
	public void MethodThree() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Method 3");
	}
	
	@Test 
	public void MethodFour() {
		System.out.println("Method 4");
	}
	
	@Test 
	public void MethodFive() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Method 5");
	}

}
