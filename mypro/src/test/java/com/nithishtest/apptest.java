package com.nithishtest;

import org.testng.Assert;

import com.nithish.App;

public class apptest {
	
	public static void main(String[] args) {
		testlogin();
		testlogin2();
		
	}
	
      public static void testlogin() {
    	  
    	  App myapp= new App();
    	  Assert.assertEquals(0, myapp.userLogin("nithish","abc@123"));
	}
      public static void testlogin2() {
    	  App myapp= new App();
    	  Assert.assertEquals(1, myapp.userLogin("nithish","abc@123"));
	}
      

}
