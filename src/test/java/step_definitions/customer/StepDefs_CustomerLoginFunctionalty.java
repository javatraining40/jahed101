package step_definitions.customer;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLogin_Page;
import pages.Landing_Page;

public class StepDefs_CustomerLoginFunctionalty extends Base {

@Given("I am landing page https:\\/\\/it.microtechlimited.com\\/")
public void i_am_landing_page_https_it_microtechlimited_com() {
  navigateURL(host);
}

@When("I click on Login menu")
public void i_click_on_Login_menu() {
	  click(Landing_Page.loginMenu);
}

@When("I click on Customer Login")
public void i_click_on_Customer_Login() {
	click(CustomerLogin_Page.menuCustomerLogin);
 
}

@Then("Enter user Id as {string}")
public void enter_user_Id_as(String userId) throws InterruptedException {
	Thread.sleep(5000);
	 sendKeys(CustomerLogin_Page.textBoxUserId, userId);
    
}

@Then("I Enter Passeord as {string}")
public void i_Enter_Passeord_as(String password) throws InterruptedException {
	Thread.sleep(5000);
    sendKeys(CustomerLogin_Page.textPassword, password);
}

@Then("I click on Login Button")
public void i_click_on_Login_Button() {
    click(CustomerLogin_Page.buttonCustomerlogin);
}

@Then("I Verify that I am in CUSTOMER Home page")
public void i_Verify_that_I_am_in_CUSTOMER_Home_page() throws InterruptedException {
	Thread.sleep(5000);
 String welcomeMsg = getElementText(By.xpath("//h2[text()='Welcome David']"));
 assertEquals("Welcome David", welcomeMsg);
}


}
