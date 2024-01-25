package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Eclipse\\Eclipse Workspace\\openmrs\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public static void getURL(String url) {
		// TODO Auto-generated method stub
		try {
			driver.get("url");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void inputValues(WebElement e, String data) {
		// TODO Auto-generated method stub
		try {
			e.sendKeys(data);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void clickOnELement(WebElement e) {
		// TODO Auto-generated method stub
		try {
			e.click();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void dropDown(WebElement e, String value) {
		// TODO Auto-generated method stub
		try {
			Select s = new Select(e);
			s.selectByValue(value);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
