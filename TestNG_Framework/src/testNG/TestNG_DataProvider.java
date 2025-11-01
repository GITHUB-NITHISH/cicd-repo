package testNG;

import org.testng.annotations.DataProvider;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_DataProvider {
	
	@DataProvider (name="MyData")
	public Object[][] dpMethod(){
		return new Object [][] { {1,3,5},{2,5,9} };
		
	}
	
	@DataProvider (name="MyData2")
	public Object[][] dpMethod2(){
		return new Object [][] {{25,20},{12,10}};
	}
	
	
	@Test (dataProvider = "MyData")
	public void MethodOne(int a,int b,int c) {
		
		System.out.println("method 1   " + (a+b+c));
	}
	
	@Test  (dataProvider="MyData2")
	public void MethodTwo(int d, int e) {
		int g=d*e;
		System.out.println("method 2   "+ g);
	}
	
	
}
