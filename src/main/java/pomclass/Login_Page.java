package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement user;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "loginButton")
	WebElement loginButton;

	@FindBy(id = "Pharmacy")
	WebElement Location;

	public WebElement getusername() {
		return user;
	}

	public WebElement getpassword() {
		return password;
	}

	public WebElement clickloginbutton() {
		return loginButton;
	}

	public WebElement clicklocation() {
		return Location;
	}

	public WebDriver getdriver() {
		return driver;
	}
}
