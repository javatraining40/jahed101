package stepDefs_CreateOrder;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerHomePage_Page;
import pages.OrderList_Page;
import pages.OrderProduct_Page;

public class StepDefs_CreateOrder extends Base {
	@Given("I click on Product menu")
	public void i_click_on_Product_menu() {

		click(CustomerHomePage_Page.menuOrderProduct);
	}

	@When("Select Product name")
	public void select_Product_name() {
		selectDropDownMenu(OrderProduct_Page.dropDownProductName, "Camera");
	}

	@When("Enter Order Date")
	public void enter_Order_Date() {
	   sendKeys(OrderProduct_Page.textBoxOrderDate, "05/14/2023");
	}

	@When("Click Order Product button")
	public void click_Order_Product_button() {
	    click(OrderProduct_Page.buttonOrderProduct);
		
	}

	@Then("Click Confirm order")
	public void click_Confirm_order() {
	  WebElement lastOrder = driver.findElement(OrderList_Page.lastOrders);
	  lastOrder.findElement(OrderList_Page.lastColumn).click();
	}

	@Then("Verify Order Status is Confirmed")
	public void verify_Order_Status_is_Confirmed() {
	  String orderStatus = getElementText(By.xpath("//tr[last()]/td[6]"));
	  assertEquals("Confirmed.", orderStatus);
	}

	






}
