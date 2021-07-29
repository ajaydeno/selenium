package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecthotel {
public static WebDriver driver;
@FindBy(id="continue")
private WebElement continu;
public selecthotel(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver, this);
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getContinu() {
	return continu;
}
public WebElement getRadio() {
	return radio;
}
@FindBy(id="radiobutton_0")
private WebElement radio;

}

