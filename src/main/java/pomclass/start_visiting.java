package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class start_visiting {
	public WebDriver driver;

	public start_visiting(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "row")
	WebElement startvisit;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getStartvisit() {
		return startvisit;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getAttachment() {
		return attachment;
	}

	public WebElement getEndvisit() {
		return endvisit;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getMerge() {
		return merge;
	}

	public WebElement getEnd() {
		return end;
	}

	@FindBy(name = "start-visit-with-visittype-confirm")
	WebElement confirm;

	@FindBy(name = "visit-documents-dropzone")
	WebElement attachment;

	@FindBy(id = "Yes")
	WebElement endvisit;

	@FindBy(id = "WEIGHT GRAPH")
	WebElement weight;

	@FindBy(name = "cancel")
	WebElement merge;

	@FindBy(id = "button task activelist")
	WebElement end;



}
