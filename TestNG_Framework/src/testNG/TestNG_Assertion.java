package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assertion {

//	@Test
//	public void MethodOne() {
//		
//		String ab="Nithish";
//		String bc="nithish";
//		String cd = null;
//		
//		Assert.assertEquals(ab, bc);    //  Checks equal or not
//		Assert.assertEquals(ab,bc,"assertion failed");
//		Assert.assertNotEquals(ab,bc);  
//		Assert.assertTrue(ab.isEmpty());
//		Assert.assertFalse(bc.isEmpty());
//		Assert.assertNull(cd);
//		Assert.assertNotNull(bc);
//		
//	}
	
	@Test
	public void MethodTwo() {
		
		String ab="Nithish";
		String bc="nithish";
		String cd = null;
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ab, bc);
		
		System.out.println("Finished");
//		sa.assertAll();
		
		
	}
}
