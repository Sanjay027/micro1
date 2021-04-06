package Com.step;



import Com.base.BaseClass;
import Com.pom.pom_1;
import Com.pom.pom_2;
import Com.pom.pom_3;
import Com.pom.pom_4;
import Com.pom.pom_5;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step extends BaseClass {

	public static void main(String[] args) {
	

	}
	
	@Given("user should launch the browser page")
	public void user_should_launch_the_browser_page() {
      
		chromeBrowserLaunch();
		LaunchURL("https://adactinhotelapp.com/");
		
		
	
		
		
	}

	@When("user shoul validate login {string} & {string}")
	public void user_shoul_validate_login(String string, String string2) {
	    
        pom_1 p1= new pom_1();
		
		sendKeys(p1.getUsername(),string);
		sendKeys(p1.getPass(), string2);
		p1.getLogin().click();
		
		
		
		
	}
	@Then("user should validate the details {string} , {string} , {string} ,{string} , {string} , {string} , {string} , {string}")
	public void user_should_validate_the_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	  
		pom_2 p2 = new pom_2();
		
		selectVisibleText(p2.getLocation(), string);
		selectVisibleText(p2.getHotels(), string2);
		selectVisibleText(p2.getRoomtypr(), string3);
		selectVisibleText(p2.getRoomnos(), string4);
		sendKeys(p2.getDatepickin(), string5);
		sendKeys(p2.getDatepickout(), string6);
		selectVisibleText(p2.getAdult(), string7);
		selectVisibleText(p2.getChildroom(), string8);
		p2.getSubmit().click();
		
	}
	
	
	@Then("user should workin on radio button")
	public void user_should_workin_on_radio_button() {
	    
		pom_3 p3 = new  pom_3();
		
		p3.getRadio().click();
		p3.getConti().click();
				
	}

	@Then("user should give their valid {string},{string},{string},{string},{string},{string},{string}")
	public void user_should_give_their_valid(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
	 
		pom_4 p4 = new  pom_4();
		
		sendKeys(p4.getFirstname(),string);
		sendKeys(p4.getLastname(), string2);
		sendKeys(p4.getAdress(), string3);
		sendKeys(p4.getCcnum(), string4);
		selectVisibleText(p4.getCardtype(), string5);
		selectVisibleText(p4.getMonth(), string6);
		selectVisibleText(p4.getYear(), string7);
		p4.getBooknow().click();
		
		pom_5 p5 = new  pom_5();
		
		p5.getBooked().click();
		
		String attribute = p5.getOrderno().getAttribute("value");
		System.out.println(attribute);
	
       driver.quit();
	}

}


















