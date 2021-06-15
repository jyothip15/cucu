package salesforce.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFeature {

	WebDriver driver;
@Given("As a user,I should be able to launch the applicatiom")
public void as_a_user_i_should_be_able_to_launch_the_applicatiom() {
/*	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com");
*/
	System.out.println("This is a browser launch");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("As a user,I should be able to enter user credentials")
public void as_a_user_i_should_be_able_to_enter_user_credentials() {
 /*   driver.findElement(By.id("username")).sendKeys("jyothi15@gmail.com");
    driver.findElement(By.id("password")).sendKeys("Blessings143");
    driver.findElement(By.id("Login")).click();*/
	System.out.println("This is alogin page");
    
}

@When("user enters {string} and blank {string} and clicks login")
public void user_enters_username_and_blank_password_and_clicks_login(String username,String pass) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("user enters blank password");
}

@Then("user should be able to see a error message for wrong credentials entered")
public void user_should_be_able_to_see_a_error_message_for_wrong_credentials_entered() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("User sees error mesage 1 ");
}

@When("user enters wrong {string} and valid {string} and clicks login")
public void user_enters_wrong_username_and_valid_password_and_clicks_login(String username,String pass) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("User sees error mesage 2 ");
}

@When("user enters {string} and {string} and clicks login")
public void user_enters_valid_username_and_valid_password_and_clicks_login(String username,String pass) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("user enters valid username and valid password and clicks login");
}

@Then("user should be able to see a home page of the application")
public void user_should_be_able_to_see_a_home_page_of_the_application() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("user should be able to see a home page of the application");
}
/*
@Given("user is in Homepage,he should be able to see usermenu dropdown")
public void user_is_in_homepage_he_should_be_able_to_see_usermenu_dropdown() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("user clicks usermenu dropdown")
public void user_clicks_usermenu_dropdown() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("user should be able to see the options profile,settings etc")
public void user_should_be_able_to_see_the_options_profile_settings_etc() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}

*/
}
