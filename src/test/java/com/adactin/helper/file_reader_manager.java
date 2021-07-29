package com.adactin.helper;

public class file_reader_manager {
//this class to create object for configuration  Runnre
	
	
	private file_reader_manager() {
	
	}
	public  Configuration_Runner getinstancecr() throws Throwable {
		Configuration_Runner cr=new Configuration_Runner();

		return cr;
	}
	
	
	
	
	
	public static file_reader_manager getInstance() {
		file_reader_manager helper=new file_reader_manager();
		return helper;

	}
	
	
	
	
	
	
	
	public Configuration_Runner getInstanceCR() throws Throwable {
		Configuration_Runner cr=new Configuration_Runner();
				return cr;

	}
	
	
}
