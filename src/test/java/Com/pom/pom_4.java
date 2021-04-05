package Com.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Com.base.BaseClass;

public class pom_4 extends BaseClass {

	public pom_4() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement adress;

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(id = "cc_cvv")
	private WebElement cvvnoo;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvvnoo() {
		return cvvnoo;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	@FindBy(id = "book_now")
	private WebElement booknow;


	public void firstN(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> asLists = dataTable.asLists();
		List<String> li = asLists.get(0);
		String name = li.get(0);
		String string = li.get(1);
		sendKeys(getFirstname(), name);
		sendKeys(getLastname(), string);
	}

	public void DetailsPage(String string, String string2, String string3, String string4, String string5,
			String string6) throws InterruptedException {

		sendKeys(getAdress(), string);
		sendKeys(getCcnum(), string2);
		selectVisibleText(getCardtype(), string3);
		selectVisibleText(getMonth(), string4);
		selectVisibleText(getYear(), string5);
		sendKeys(getCvvnoo(), string6);
		click(getBooknow());

		Thread.sleep(2000);
	}

//	public void orderno() throws InterruptedException {
//
//		pom_Class4 p4 = new pom_Class4();
//
//		WebElement orgerno = p4.getOrgerno();
//		String attribute = orderno.getAttribute("value");
//		System.out.println(attribute);
//		
//		Thread.sleep(2000);
//		
//		driver.close();

	}

