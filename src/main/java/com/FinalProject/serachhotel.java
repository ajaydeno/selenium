package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class serachhotel {
public static WebDriver driver;
@FindBy(id="datepick_in")
private WebElement checkindate;
public serachhotel(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getNoofrooms() {
	return noofrooms;
}
public WebElement getAdultperroom() {
	return adultperroom;
}
public WebElement getChildperroom() {
	return childperroom;
}
public WebElement getSubmit() {
	return submit;
}
@FindBy(id="datepick_out")
private WebElement checkout;
@FindBy(name = "location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="room_nos")
private WebElement noofrooms;
@FindBy(id="adult_room")
private WebElement adultperroom;
@FindBy(id="child_room")
private WebElement childperroom;
@FindBy(id="Submit")
private WebElement submit;

}
