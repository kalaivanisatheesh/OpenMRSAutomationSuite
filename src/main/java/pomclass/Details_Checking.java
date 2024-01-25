package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details_Checking {
	public WebDriver driver;

	public Details_Checking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "givenName")
	WebElement names;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNames() {
		return names;
	}

	public WebElement getMdname() {
		return mdname;
	}

	public WebElement getFam() {
		return fam;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getRelation() {
		return relation;
	}

	public WebElement getClear() {
		return clear;
	}

	@FindBy(name = "middleName")
	WebElement mdname;

	@FindBy(name = "familyName")
	WebElement fam;

	@FindBy(id = "Male")
	WebElement gender;

	@FindBy(id = "birthdateDay-field")
	WebElement DOB;

	@FindBy(id = "address1")
	WebElement Address;

	@FindBy(name = "Phone Number")
	WebElement phone;

	@FindBy(name = "relationship_type")
	WebElement relation;

	@FindBy(id = "submit")
	WebElement clear;

}
