package step_definitions.customer;

import static org.junit.Assert.assertTrue;

import base.Base;
import io.cucumber.datatable.DataTable ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CustomerHomePage_Page;
import pages.CustomerLogin_Page;

public class StepDefs_CustomerOrder extends Base {
	@Given("I logged in as Customer")
	public void i_logged_in_as_Customer(DataTable dataTable) {
	    String welcomeMsg = CustomerLogin_Page.LoginAsCustomer(dataTable.cell(1, 0),dataTable.cell(1, 1));
	    
		
	}

	@When("Click on Order List Menu")
	public void click_on_Order_List_Menu() {
	    click(CustomerHomePage_Page.menuOrderList);
	}

	@When("Verify Total count is greater than {int}")
	public void verify_Total_count_is_greater_than(Integer maxCount) {
	    int totalOrder = getTotalElementsCount(CustomerHomePage_Page.tableRowsOrderList);
	    assertTrue(totalOrder > maxCount);
	}




}
