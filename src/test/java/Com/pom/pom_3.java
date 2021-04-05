package Com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import Com.base.BaseClass;

public class pom_3  extends BaseClass{

	
	public pom_3() {
		
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy (id ="continue")
	private WebElement conti;


	
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getConti() {
		return conti;

	}
	public void hotelselect() {
		
		click(getRadio());
		click(getConti());
		
	}
		
		

	}
