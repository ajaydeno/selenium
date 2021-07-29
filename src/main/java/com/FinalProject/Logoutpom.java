package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpom {
	public static WebDriver driver;
	@FindBy(id="logout")
	private WebElement logout;
	public Logoutpom(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return logout;
	}

}
