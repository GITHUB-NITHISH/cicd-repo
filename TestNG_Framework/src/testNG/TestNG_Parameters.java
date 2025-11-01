package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNG_Parameters {
	
	@Test 
	@Parameters({"v1","v2"})
	public void MethodOne(int a, int b) {
		int c= a+b;
		System.out.println("method 1    :  " + c );
	}
	
	@Test 
	public void MethodTwo() {
		
		System.out.println("method 2");
	}
	
	@Test 
	@Parameters({"a1","a2","a3"})
	public void MethodThree(int c, String d,float e) throws InterruptedException {
		
		System.out.println("Method 3"+c+d+e);
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
