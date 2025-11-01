package com.reader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;
	
    public void Configuartion_Reader() throws IOException {
    	
    	File f = new File("src\\test\\resources\\Testdata\\Configuration.properties");
    	FileInputStream fis = new FileInputStream(f);
    	p= new Properties();
    	p.load(fis);
    	
    }
    
    public String getBrowser() {
    	String browser = p.getProperty("browser");
    	return browser;
    }
    
    public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
    
    public String getUsername() {
    	String username = p.getProperty("username");
    	return username;
    }
    
    public String getPassword() {
    	String password = p.getProperty("password");
    	return password;
    }
    
    public String getExpectedString() {
    	String Exp_String = p.getProperty("expectedString");
    	return Exp_String;
    }
    
   
}
