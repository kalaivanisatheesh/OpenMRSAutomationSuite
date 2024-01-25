package stepdefintion;

import java.io.IOException;

import com.helpers.Configuration_Reader;
import com.helpers.File_Reader_Manager;

import baseclass.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomclass.Details_Checking;
import pomclass.Login_Page;
import pomclass.start_visiting;

public class stepdefintion extends baseclass {
	Login_Page p = new Login_Page(driver);
	Details_Checking d = new Details_Checking(driver);
	start_visiting j = new start_visiting(driver);

	@Given("user launch the application")
	public void user_launch_the_application() throws IOException {
		try {
			String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
			getURL(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user enter the user name")
	public void user_enter_the_user_name() throws IOException {
		try {
			String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();
			inputValues(p.getusername(), username);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user enter the password")
	public void user_enter_the_password() throws IOException {
		try {
			String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
			inputValues(p.getpassword(), password);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user click the login button and it navigate to next page")
	public void user_click_the_login_button_and_it_navigate_to_next_page() {
		try {
			clickOnELement(p.clickloginbutton());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user click on the patant menu")
	public void user_click_on_the_patant_menu() {
		try {
			inputValues(d.getNames(), "test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user enter the details are name")
	public void user_enter_the_details_are_name() {
		try {
			inputValues(d.getMdname(), "data");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user enter the gender")
	public void user_enter_the_gender() {
		try {
			inputValues(d.getGender(), "click");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user enter the date of birth")
	public void user_enter_the_date_of_birth() {
		try {
			inputValues(d.getDOB(), "12.90.90");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user contact info in phone number")
	public void user_contact_info_in_phone_number() {
		try {
			inputValues(d.getPhone(), "1234567890");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("usen enter the address")
	public void usen_enter_the_address() {
		try {
			inputValues(d.getAddress(), "cbe");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user confirm the details")
	public void user_confirm_the_details() {
		try {
			clickOnELement(j.getConfirm());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user drop the file in selected place")
	public void user_drop_the_file_in_selected_place() {
		try {
			inputValues(d.getFam(),
					"D:\\Eclipse\\Eclipse Workspace\\openmrs\\src\\test\\java\\com\\helpers\\data.properties");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user click the upload button")
	public void user_click_the_upload_button() {
		try {
			clickOnELement(j.getConfirm());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user click the endvisit")
	public void user_click_the_endvisit() {
		try {
			clickOnELement(j.getEndvisit());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user enter the weight")
	public void user_enter_the_weight() {
		try {
			inputValues(j.getWeight(), "48");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user click the save button")
	public void user_click_the_save_button() {
		try {
			clickOnELement(j.getConfirm());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user merge selelcted visit")
	public void user_merge_selelcted_visit() {
		try {
			clickOnELement(j.getStartvisit());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
