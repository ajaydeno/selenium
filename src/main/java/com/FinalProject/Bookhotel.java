package com.FinalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel {
public static WebDriver driver;
@FindBy(id="hotel_name_dis")
private WebElement hotelname;
@FindBy(id="location_dis")
private WebElement location;
@FindBy(id="room_type_dis")
private WebElement roomtype;
@FindBy(id="room_num_dis")
private WebElement noofrooms;
@FindBy(id="total_days_dis")
private WebElement totaldays;
@FindBy(xpath="right")
private WebElement pricepernight;
@FindBy(id="total_price_dis")
private WebElement totalprice;
@FindBy(id="first_name")
private WebElement firstname;
public Bookhotel(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getHotelname() {
	return hotelname;
}
public WebElement getLocation() {
	return location;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getNoofrooms() {
	return noofrooms;
}
public WebElement getTotaldays() {
	return totaldays;
}
public WebElement getPricepernight() {
	return pricepernight;
}
public WebElement getTotalprice() {
	return totalprice;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAdress() {
	return adress;
}
public WebElement getCardno() {
	return cardno;
}
public WebElement getCreditcardtype() {
	return creditcardtype;
}
public WebElement getSelectmonth() {
	return selectmonth;
}
public WebElement getSelectyear() {
	return selectyear;
}
public WebElement getCcvnum() {
	return ccvnum;
}
public WebElement getBooknow() {
	return booknow;
}
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement adress;
@FindBy(id="cc_num")
private WebElement cardno;
@FindBy(id="cc_type")
private WebElement creditcardtype;
@FindBy(id="cc_exp_month")
private WebElement selectmonth ;
@FindBy(id="cc_exp_year")
private WebElement selectyear ;
@FindBy(id="cc_cvv")
private WebElement ccvnum ;
@FindBy(id="book_now")
private WebElement booknow ;




}
