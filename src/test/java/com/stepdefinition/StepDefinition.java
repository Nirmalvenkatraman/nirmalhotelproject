package com.stepdefinition;


import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	PojoClass p;
	@Given("User launch adactin hotel Web application")
	public void user_launch_adactin_hotel_Web_application() {
		
		}

	@Then("User verify adactin hotel login page is verfied")
	public void user_verify_adactin_hotel_login_page_is_verfied() {
		p=new PojoClass();
		String Url = getCurrentUrl();
		boolean b = Url.contains("adactinhotelapp");
		System.out.println("get current url status= "+b);
	   
	}

	@When("To Enter the vaild username and vaild password")
	public void to_Enter_the_vaild_username_and_vaild_password() {
		p=new PojoClass();
		type(p.getTxtuser(),"vinithnirmal1997");
		type(p.getTxtpass(), "nirmal97@");
		}

	@When("User click a login Button")
	public void user_click_a_login_Button() {
		p=new PojoClass();
		click(p.getBtnlogin());
	}

	@Then("User verify adactin hotel Search hotel page is displayed")
	public void user_verify_adactin_hotel_Search_hotel_page_is_displayed() {
		p=new PojoClass();
		String text = getText(p.getWelcometext());
		System.out.println(text);
		WebElement element = p.getWelcometext();
		boolean c = element.isDisplayed();
		System.out.println("welcome page verfied = "+c);
	    
	}
	@When("To User Select Location,Hotels,RoomType,NumberofRooms,CheckInDate,CheckOutDate,AdultsperRoom,ChildrenperRoom")
	public void to_User_Select_Location_Hotels_RoomType_NumberofRooms_CheckInDate_CheckOutDate_AdultsperRoom_ChildrenperRoom() {
		p=new PojoClass();
		selectVisibleTextDropDown(p.getDropdownlocation(), "Brisbane");
		selectVisibleTextDropDown(p.getDropdownhotels(), "Hotel Hervey");
		selectVisibleTextDropDown(p.getDroproomtype(), "Standard");
		selectVisibleTextDropDown(p.getDroproom(),"3 - Three");
		type(p.getCheckindate(),"13/02/2022");
		type(p.getCheckoutdate(),"15/02/2022");
		selectVisibleTextDropDown(p.getDropadult(),"3 - Three");
		selectVisibleTextDropDown(p.getDropchild(),"3 - Three");
		
	}
	@When("To user click a Search button")
	public void to_user_click_a_Search_button() {
		p=new PojoClass();
		click(p.getSearchbtn());
	}

	@Then("User verify adactin hotel Select Hotel is displayed")
	public void user_verify_adactin_hotel_Select_Hotel_is_displayed() {
		p=new PojoClass();
		WebElement c = p.getSearchhoteltext();
		boolean d = c.isDisplayed();
		System.out.println("select hotel page displyed= "+d);
	}

	@Then("User Click a radio Button and continue Button")
	public void user_Click_a_radio_Button_and_continue_Button() {
		p=new PojoClass();
		click(p.getRadiobtn());
		click(p.getContinuebtn());
		
	}
	@Then("User verify adactin hotel Book A Hotel page is displayed")
	public void user_verify_adactin_hotel_Book_A_Hotel_page_is_displayed() {
		p=new PojoClass();
		WebElement bookahoteltext = p.getBookahoteltext();
	  boolean d = bookahoteltext.isDisplayed();
	  System.out.println("book a hotel page displayed= "+d);
	}
	@When("To Enter the FirstName,LastName,BillingAddress")
	public void to_Enter_the_FirstName_LastName_BillingAddress() {
		p=new PojoClass();
		type(p.getTxtfirstname(), "nirmalvenkat");
		type(p.getTxtlastname(), "raman");
		type(p.getTxtaddress(),"73,chennai,tamilnadu,india");
	}
	@When("To enter CreditCardNo and to selectCreditCardType,ExpiryDate,ExpiryYear and Enter CVVNumber")
	public void to_enter_CreditCardNo_and_to_selectCreditCardType_ExpiryDate_ExpiryYear_and_Enter_CVVNumber() {
		p=new PojoClass();
		type(p.getTxtcreditno(), "9876543468986435");
		selectVisibleTextDropDown(p.getDropcrdittype(),"VISA");
		selectVisibleTextDropDown(p.getDropmonth(),"March");
		selectVisibleTextDropDown(p.getDropyear(),"2020");
		type(p.getTxtcvv(),"345");
	}
	@When("To user Click the book now button")
	public void to_user_Click_the_book_now_button() {
		p=new PojoClass();
		click(p.getBtnbooknow());	
	}
@Then("User verify adactin hotel Booking Confirmation is displayed")
	public void user_verify_adactin_hotel_Booking_Confirmation_is_displayed() {
	p=new PojoClass();
	WebElement bookingconfirmtext = p.getBookingconfirmtext();
	boolean e = bookingconfirmtext.isDisplayed();
	System.out.println("booking confirmation page displayed ="+e);
	}

	@When("To order id generated in console")
	public void to_order_id_generated_in_console() throws InterruptedException {
		p=new PojoClass();
		String a = getAttribute(p.getOrderid(),"value");
		System.out.println("order id ="+a);
	}
	@When("To user Click the my Itinerary button")
	public void to_user_Click_the_my_Itinerary_button() {
		p=new PojoClass();
		click(p.getBtnclick());
	}

	@Then("User verify adactin hotel Booked Itinerary is displayed")
	public void user_verify_adactin_hotel_Booked_Itinerary_is_displayed() {
		p=new PojoClass();
		WebElement bookiterarypage = p.getBookiterarypage();
		boolean h = bookiterarypage.isDisplayed();
		System.out.println("hotel Booked Itinerary page ="+h);
	}
	
	@When("To Enter the vaild {string} and vaild {string}")
	public void to_Enter_the_vaild_and_vaild(String username, String password) {
		p=new PojoClass();
		type(p.getTxtuser(),username);
		type(p.getTxtpass(),password);
		
	}

	@When("To User Select {string},{string},{string},{string},{string},{string},{string},{string}")
	public void to_User_Select(String Location, String Hotels,String RoomType,String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		p=new PojoClass();
		selectVisibleTextDropDown(p.getDropdownlocation(),Location);
		selectVisibleTextDropDown(p.getDropdownhotels(),Hotels);
		selectVisibleTextDropDown(p.getDroproomtype(),RoomType);
		selectVisibleTextDropDown(p.getDroproom(),NumberofRooms);
		type(p.getCheckindate(),CheckInDate);
		type(p.getCheckoutdate(),CheckOutDate);
		selectVisibleTextDropDown(p.getDropadult(),AdultsperRoom);
		selectVisibleTextDropDown(p.getDropchild(),ChildrenperRoom);
		}

	@When("To Enter the {string},{string},{string}")
	public void to_Enter_the(String FirstName, String LastName, String BillingAddress) {
		p=new PojoClass();
		type(p.getTxtfirstname(),FirstName);
		type(p.getTxtlastname(),LastName);
		type(p.getTxtaddress(),BillingAddress);
		}
	@When("To enter {string} and to {string},{string},{string} and Enter {string}")
	public void to_enter_and_to_and_Enter(String CreditCardNo, String selectCreditCardType,String ExpiryDate, String ExpiryYear, String CVVNumber) {
		p=new PojoClass();
		type(p.getTxtcreditno(),CreditCardNo);
		selectVisibleTextDropDown(p.getDropcrdittype(),selectCreditCardType);
		selectVisibleTextDropDown(p.getDropmonth(),ExpiryDate);
		selectVisibleTextDropDown(p.getDropyear(),ExpiryYear);
		type(p.getTxtcvv(),CVVNumber);
		
	}


}
