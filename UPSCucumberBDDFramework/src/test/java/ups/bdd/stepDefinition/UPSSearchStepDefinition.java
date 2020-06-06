package ups.bdd.stepDefinition;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ups.bdd.pageActions.UPSHomePageActions;
import ups.bdd.utility.InvokeDriver;

public class UPSSearchStepDefinition {
	
	UPSHomePageActions PageActions = new UPSHomePageActions();
	
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {
	PageActions.openBrowser();
	}

	@When("^The user navigate to the UPS home page \"([^\"]*)\"$")
	public void the_user_navigate_to_the_UPS_home_page(String arg1) throws Throwable {
	PageActions.openBrowser();
	}

	@Then("^User click on log in icon$")
	public void user_click_on_log_in_icon() throws Throwable {
		PageActions.clickLogIn();
	}

	@Then("^User enter User ID \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enter_User_ID_and_Password(String arg1, String arg2) throws Throwable {
		PageActions.useridpassword(arg1, arg2);
	}

	@Then("^User click login button$")
	public void user_click_login_button() throws Throwable {
		PageActions.LogInButton();
	}

	@Then("^User must login to the UPS account successfully$")
	public void user_must_login_to_the_UPS_account_successfully() throws Throwable {
	}

	@Then("^User track item with valid tracking number \"([^\"]*)\"$")
	public void user_track_item_with_valid_tracking_number(String arg1) throws Throwable {
		PageActions.TrackItem(arg1);
	}

	@Then("^Submit search$")
	public void submit_search() throws Throwable {
		PageActions.Submit();
	
	JavascriptExecutor js = (JavascriptExecutor)InvokeDriver.driver;
	js.executeScript("window.scrollBy(0,450)");
	}
	@Then("^User click on shipment progress$")
	public void user_click_on_shipment_progress() throws Throwable {
	PageActions.ShipmentProgress();	
}

@Then("^User click on Detailed View tab$")
public void user_click_on_Detailed_View_tab() throws Throwable {
	PageActions.DetailedView();
	
}

@Then("^User click on proof of delivery to verify then exit out$")
public void user_click_on_proof_of_delivery_to_verify_then_exit_out() throws Throwable {
PageActions.ProofofDelivery();
JavascriptExecutor js = (JavascriptExecutor)InvokeDriver.driver;
js.executeScript("window.scrollBy(0,-450)");
}
	@Then("^User log out by clicking log out icon$")
	public void user_log_out_by_clicking_log_out_icon() throws Throwable {
		PageActions.LogOut();
	}

	@Then("^Validate logout page and user close the browser$")
	public void validate_logout_page_and_user_close_the_browser() throws Throwable {
		PageActions.Validation();
	}
}
