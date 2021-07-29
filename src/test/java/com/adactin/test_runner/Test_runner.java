package com.adactin.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.helper.file_reader_manager;

import baseclass.baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//FeatureFile",glue = "com.adactin.stepdefinition",monochrome=true,dryRun =false , strict=true,
plugin="pretty")

		
		
public class Test_runner extends baseclass {

public static WebDriver driver;

@BeforeClass
public  static void set_up() throws Throwable {
	String browser = file_reader_manager.getInstance().getInstanceCR().getBrowser();
	
	driver=baseclass.ajaydeno(browser);
	
	

}
@AfterClass
public static void tearDown() {
	driver.close();
	

}
	
	
	
	
	
	
	
}
