package salesforce.stepdefinitions;

import java.util.List;

import org.openqa.selenium.ElementNotVisibleException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	@Given("User is in HomePage,He should be able to see usermenu dropdown")
	public void user_is_in_home_page_he_should_be_able_to_see_usermenu_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home page displayed");
	}

	@When("User should be able to click on user menu")
	public void user_should_be_able_to_click_on_user_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user menu is visible");
//	    throw new ElementNotVisibleException("No element");
	}

//	@Then("User menu dropdown should contain {string},{string},{string},{string}")
//	public void user_menu_dropdown_should_contain(String string, String string2, String string3, String string4) {
//	@Then("User menu dropdown should contain {string}")
//	public void user_menu_dropdown_should_contain(String string) {
	@Then("User menu dropdown should contain UsermenuOptions")
	public void user_menu_dropdown_should_contain(DataTable table) {
	// Write code here that turns the phrase above into concrete actions
		
	  List<String> userMenuOptions = table.asList();
	  System.out.println("validating user menu options");
	  for(String s:userMenuOptions) {
		  System.out.println(s);
	  }
	 
	}

	@When("User should be able to click on my profile from the usermenu")
	public void user_should_be_able_to_click_on_my_profile_from_the_usermenu() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("navigating to my_profile.. ");
	}

	@Then("User should be seeing profile page")
	public void user_should_be_seeing_profile_page() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("user is in my profile page");
	}

	@When("User should be able to click on edit button")
	public void user_should_be_able_to_click_on_edit_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("edit button click..");
	}

	@Then("user should be seeing edit profile pop up window")
	public void user_should_be_seeing_edit_profile_pop_up_window() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("edit profile pop up ");
	}

	@When("user should be able to click on about tab")
	public void user_should_be_able_to_click_on_about_tab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("navigating to about tab");
	   
	}

	@When("user should be able to enter lastname and click on saveall button")
	public void user_should_be_able_to_enter_lastname_and_click_on_saveall_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("saving my profile changes");
	}

	@Then("user profile page should be visible with the changed lastname")
	public void user_profile_page_should_be_visible_with_the_changed_lastname() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validating user profile name change");
	}


}
