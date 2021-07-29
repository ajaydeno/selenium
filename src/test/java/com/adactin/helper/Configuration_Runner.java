package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Runner {
	public static Properties p;
 public Configuration_Runner() throws Throwable {
	 File f=new File("C:\\Users\\Ajay\\eclipse-workspace\\FinalProject\\src\\test\\java\\com\\adctin\\properties\\configuration.properties");
	 FileInputStream fis=new FileInputStream(f);
	 p=new Properties();
	 p.load(fis);
	 
}
 public String getBrowser() {
	 String browser = p.getProperty("browser");
	 return browser;
	 
	

}
 public String geturl() {
	String url = p.getProperty("url");
	return url;

}
 public String getcvvnum() {
	 String property = p.getProperty("cvv");
	 return property;
 }
}
