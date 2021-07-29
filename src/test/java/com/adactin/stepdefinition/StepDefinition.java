package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.FinalProject.Bookhotel;
import com.FinalProject.Pom_loginpage;
import com.FinalProject.bookconfirm;
import com.FinalProject.selecthotel;
import com.FinalProject.serachhotel;
import com.adactin.helper.Page_object_manager;
import com.adactin.test_runner.Test_runner;

import baseclass.baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends baseclass {
	public static WebDriver driver=Test_runner.driver;
	


public static Pom_loginpage lk=new Pom_loginpage(driver);
public static serachhotel sh=new serachhotel(driver);
public static selecthotel st=new selecthotel(driver);
public static Bookhotel bh=new Bookhotel(driver);
public static bookconfirm bc=new bookconfirm(driver);

//public static Page_object_manager pom=new Page_object_manager(driver);

	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
	    geturl("http://adactinhotelapp.com/index.php");
	}

	@When("^Enter the UserName In UserName field$")
	public void enter_the_UserName_In_UserName_field() throws Throwable {
	     sendkeys(lk.getUsername(), "AjayDeno");
	}

	@When("^user enter the password in password field$")
	public void user_enter_the_password_in_password_field() throws Throwable {
	     sendkeys(lk.getPassword(), "ST455U");
	    
	}

	@Then("^user click the login button and it navigates to search hotel page$")
	public void user_click_the_login_button_and_it_navigates_to_search_hotel_page() throws Throwable {
	     clickonelement(lk.getLogin());
	}

	@When("^user select the location in Adactin Application$")
	public void user_select_the_location_in_Adactin_Application() throws Throwable {
		         Thread.sleep(5000);
		         dropdownselection(sh.getLocation(), "index", "5");
		         
			
	   //WebElement element= driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
	     //Select s=new Select(element);
	     //s.selectByIndex(5);
	     
	       
	}

	@When("^user select the Hotels in Adactin Application$")
	public void user_select_the_Hotels_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dropdownselection(sh.getHotels(), "index", "2");//index
		
		
	    
	}

	@When("^user select the roomType in Adactin Application$")
	public void user_select_the_roomType_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dropdownselection(sh.getRoomtype(), "index", "4");
	    
	}

	@When("^user select number of rooms in Adactin Application$")
	public void user_select_number_of_rooms_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dropdownselection(sh.getNoofrooms(), "index", "2");
	    
	    
	}

	@When("^user check in date in Adactin Application$")
	public void user_check_in_date_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    sendkeys(sh.getCheckindate(), "20/05/2021");
	    
	}

	@When("^user check out date in Adactin Application$")
	public void user_check_out_date_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    sendkeys(sh.getCheckout(), "23/05/2021");
	  
	}

	@When("^adults per room in Adactin Application$")
	public void adults_per_room_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    dropdownselection(sh.getAdultperroom(), "index","2");
	    
	}

	@When("^children per room in Adactin Application$")
	public void children_per_room_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    dropdownselection(sh.getChildperroom(), "index","2");
	  
	}

	@Then("^user click the search button and it navigates to select hotel$")
	public void user_click_the_search_button_and_it_navigates_to_select_hotel() throws Throwable {
	     clickonelement(sh.getSubmit());
	    
	}

	@When("^user select hotel sunshine in Adactin Application$")
	public void user_select_hotel_sunshine_in_Adactin_Application() throws Throwable {
	     
	    clickonelement(st.getRadio());
	}

	@Then("^user click the continue button it navigates to book a hotel in Adactin Application$")
	public void user_click_the_continue_button_it_navigates_to_book_a_hotel_in_Adactin_Application() throws Throwable {
	   clickonelement(st.getContinu());
	    
	}

	@When("^user enter the firstName in firstname field$")
	public void user_enter_the_firstName_in_firstname_field() throws Throwable {
	    sendkeys(bh.getFirstname(), "Ajay");
	 
	}

	@When("^user enter the LastName in lastname field$")
	public void user_enter_the_LastName_in_lastname_field() throws Throwable {
	    sendkeys(bh.getLastname(), "deno");
	    
	}

	@When("^user enter the billingAddress in Adactin Application$")
	public void user_enter_the_billingAddress_in_Adactin_Application() throws Throwable {
	    sendkeys(bh.getAdress(), "no4 chetty street 6th cross melayanambakkam");
	    
	}

	@When("^user  enter the  credit card number in credit card Number Field$")
	public void user_enter_the_credit_card_number_in_credit_card_Number_Field() throws Throwable {
	   sendkeys(bh.getCardno(), "2109171040051001");
	  
	}

	@When("^user select  the creditCard type$")
	public void user_select_the_creditCard_type() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    dropdownselection(bh.getCreditcardtype(), "index", "3");
	   
	}

	@When("^user select the Expiry Month$")
	public void user_select_the_Expiry_Month() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    dropdownselection(bh.getSelectmonth(), "index","6");
	    
	}

	@When("^user select the Expiry Year$")
	public void user_select_the_Expiry_Year() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    dropdownselection(bh.getSelectyear(), "index", "11");
	    
	}

	@When("^user enter the cvv number in cvv number field$")
	public void user_enter_the_cvv_number_in_cvv_number_field() throws Throwable {
	    sendkeys(bh.getCcvnum(), "341");
	   
	}

	@Then("^user click the BookNow and it navigates to booking confirm in in Adactin Application$")
	public void user_click_the_BookNow_and_it_navigates_to_booking_confirm_in_in_Adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    clickonelement(bh.getBooknow());
	   
	}

	@Then("^user click the My iterinery Button in adactin Application$")
	public void user_click_the_My_iterinery_Button_in_adactin_Application() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		clickonelement(bc.getIternary());
	    
	   
	}
	
	
}
