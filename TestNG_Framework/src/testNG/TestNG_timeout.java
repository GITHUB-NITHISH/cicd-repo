package testNG;

import org.testng.annotations.Test;

public class TestNG_timeout {

	
	@Test (timeOut=4000)
	public void M1() throws InterruptedException {
		
		Thread.sleep(3000);
		
		System.out.println("M1 timeout");
	}
	
	@Test (timeOut=2000)
	public void M2() throws InterruptedException {
		
		Thread.sleep(3000);
		
		System.out.println("M2 timeout");
	}
	
	
}
