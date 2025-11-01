package com.nithish;

import java.util.ResourceBundle;

public class App {
	
    public int userLogin(String user, String pwd) {
    	
    	ResourceBundle rb= ResourceBundle.getBundle("config");
    	String u = rb.getString("username");
    	String p = rb.getString("password");
    	
    	if(user.equals(u) && pwd.equals(p))
    		return 1;	
        else
	    	return 0;
    }

    }
