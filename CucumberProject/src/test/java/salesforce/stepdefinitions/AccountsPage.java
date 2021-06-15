package salesforce.stepdefinitions;

import org.openqa.selenium.ElementNotVisibleException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsPage {

	@Before("@smoke")	
	public void startDriver() {
		System.out.println("initial config");
	}

	@After("@smoke")	
    public void tearDown() {
		System.out.println("close driver");
	}
	@Before("@test")
	public void reportConfig() {
		System.out.println("reports ....");
	}
	@After("@test")
	public void reportClose() {
		System.out.println("reports closing");
	}
	
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on the homepage");
	}

	@When("user clicks on the accounts link")
	public void user_clicks_on_the_accounts_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Click on accounts");
		// throw new ElementNotVisibleException("No element");
	}

	@Then("user should see accounts page")
	public void user_should_see_accounts_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Accounts Page..");
	}

	@Given("user is on the accounts page")
	public void user_is_on_the_accounts_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Accounts Page..");
	}

	@When("user clicks on the new button")
	public void user_clicks_on_the_new_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("create new account..");
	}

	@When("user should see new account edit page")
	public void user_should_see_new_account_edit_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Accounts edit  Page..");
	}

	@When("user should be able to enter details on all fields")
	public void user_should_be_able_to_enter_details_on_all_fields() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Enter details on the accounts Page..");
	}

	@Then("user should see the new accounts page with the account details")
	public void user_should_see_the_new_accounts_page_with_the_account_details() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Account details is visible");
	}


}
