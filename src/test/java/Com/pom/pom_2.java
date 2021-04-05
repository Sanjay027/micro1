package Com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.base.BaseClass;

public class pom_2  extends BaseClass{
   
	public pom_2() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (id = "location")
	private WebElement location;
	

	@FindBy (id = "hotels")
	private WebElement hotels;
	

	@FindBy (id = "room_type")
	private WebElement roomtypr;
	

	@FindBy (id = "room_nos")
	private WebElement roomnos;
	

	@FindBy (id = "datepick_in")
	private WebElement datepickin;
	

	@FindBy (id = "datepick_out")
	private WebElement datepickout;
	
	@FindBy (id = "adult_room")
	private WebElement adult;

	@FindBy (id = "child_room")
	private WebElement childroom;
	
	@FindBy (id = "Submit")
	private WebElement Submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtypr() {
		return roomtypr;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	
	
	
}
