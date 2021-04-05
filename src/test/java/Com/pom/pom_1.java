package Com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.base.BaseClass;

public class pom_1  extends BaseClass{
	
	
	public pom_1() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id ="username")
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement pass;
	
	@FindBy (id ="login")
	private WebElement  login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	

}
