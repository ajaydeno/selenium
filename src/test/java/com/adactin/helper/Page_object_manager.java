package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.FinalProject.Bookhotel;
import com.FinalProject.Logoutpom;
import com.FinalProject.Pom_loginpage;
import com.FinalProject.bookconfirm;
import com.FinalProject.selecthotel;
import com.FinalProject.serachhotel;


public class Page_object_manager {
	public static WebDriver driver;
	private Pom_loginpage search;
	private Bookhotel bh;
	private selecthotel st;
	private serachhotel sh;
	private bookconfirm bc;
	private Logoutpom log;
	



   public Page_object_manager(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
private void ajay() {
		
	}
   private Logoutpom getinstanceLogout() {
	log=new Logoutpom(driver);
	return log;

}
   
    public Pom_loginpage getinstancelogin() {
		search=new Pom_loginpage(driver);
		return search;

	}

	public selecthotel getinstanceselecthotel() {
	st=new selecthotel(driver);
	return st;

}
public serachhotel getinstancesearchhotel() {
	sh=new serachhotel(driver);
	return sh;
}

public Bookhotel getinstancebookhote() {
	 bh=new Bookhotel(driver);
	return bh;

}
public bookconfirm getinstanceboookconfirm() {

	 bc=new bookconfirm(driver);
	return bc;

}
}
