package Com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.base.BaseClass;


public class pom_5 extends BaseClass {

	public pom_5() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "order_id_389794")
	private WebElement orderno;


	@FindBy(xpath="//a[@href='BookedItinerary.php']")
	private WebElement booked;
	
	
	
	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getBooked() {
		return booked;
	}

	

	public void verify() throws InterruptedException {
		driver.close();
		
	}

}
