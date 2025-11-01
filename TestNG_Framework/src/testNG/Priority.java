package testNG;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class Priority {
	
	
	// Ascending ASCII caps-97-122 and Small-65-90
	
	@Test (priority=1)
	public void P() {
		System.out.println("L");
	}
	
	@Test (priority=-2)
	public void Q() {
		System.out.println("M");
	}
	
	@Test(priority=3)
	public void R() {
		System.out.println("A");
	}
	
	@Test
	public void s() {
		System.out.println("s");
	}
	
	@Test
	public void a() {					// with no priority it considered as Zero
		System.out.println("a");
	}
	@Test (priority=3)
	public void x() {
		System.out.println("x");		// for same priority -> Ascending ASCII
	}
}
