package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PojoClass extends BaseClass {
	public PojoClass() {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(id="username")
	private WebElement txtuser;
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
	private WebElement btnlogin;
	@FindBy(xpath="//td[contains(text(),'Welcome')]")
	private WebElement welcometext;
	@FindBy(id="location")
	private WebElement dropdownlocation;
	@FindBy(id="hotels")
	private WebElement dropdownhotels;
	@FindBy(id="room_type")
	private WebElement droproomtype;
	@FindBy(id="room_nos")
	private WebElement droproom;
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	@FindBy(id="datepick_out")
	private WebElement checkoutdate;
	@FindBy(id="adult_room")
	private WebElement dropadult;
	@FindBy(id="child_room")
	private WebElement dropchild;
	@FindBy(id="Submit")
	private WebElement searchbtn;
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement searchhoteltext;
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	@FindBy(id="continue")
	private WebElement continuebtn;
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookahoteltext;
	@FindBy(id="first_name")
	private  WebElement txtfirstname;
	@FindBy(id="last_name")
	private  WebElement txtlastname;
	@FindBy(id="address")
	private WebElement txtaddress;
	@FindBy(id="cc_num")
	private WebElement txtcreditno;
	@FindBy(id="cc_type")
	private  WebElement dropcrdittype;
	@FindBy(id="cc_exp_month")
	private WebElement dropmonth;
	@FindBy(id="cc_exp_year")
	private WebElement dropyear;
	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	@FindBy(id="book_now")
	private WebElement btnbooknow;
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingconfirmtext;
	@FindBy(xpath="(//input[@class='disable_text'])[15]")
	private WebElement orderid;
	@FindBy(id="my_itinerary")
	private WebElement btnclick;
	@FindBy(xpath="//td[text()='Booked Itinerary']")
	private WebElement bookiterarypage;
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getWelcometext() {
		return welcometext;
	}
	public WebElement getDropdownlocation() {
		return dropdownlocation;
	}
	public WebElement getDropdownhotels() {
		return dropdownhotels;
	}
	public WebElement getDroproomtype() {
		return droproomtype;
	}
	public WebElement getDroproom() {
		return droproom;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getDropadult() {
		return dropadult;
	}
	public WebElement getDropchild() {
		return dropchild;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getSearchhoteltext() {
		return searchhoteltext;
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	public WebElement getBookahoteltext() {
		return bookahoteltext;
	}
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtaddress() {
		return txtaddress;
	}
	public WebElement getTxtcreditno() {
		return txtcreditno;
	}
	public WebElement getDropcrdittype() {
		return dropcrdittype;
	}
	public WebElement getDropmonth() {
		return dropmonth;
	}
	public WebElement getDropyear() {
		return dropyear;
	}
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	public WebElement getBookingconfirmtext() {
		return bookingconfirmtext;
	}
	public WebElement getOrderid() {
		return orderid;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	public WebElement getBookiterarypage() {
		return bookiterarypage;
	}
		 
	 
	 

}
