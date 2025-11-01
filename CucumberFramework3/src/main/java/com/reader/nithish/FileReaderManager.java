package com.reader.nithish;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		// private constructor restrict object creation outside the class
	}
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager frm= new FileReaderManager();
		return frm;
	}
	
	public Configuration_Reader getInstanceCR() throws IOException{
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}

}
