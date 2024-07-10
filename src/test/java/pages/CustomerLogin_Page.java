package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;

public class CustomerLogin_Page extends Base {
	//locators
	public static By menuCustomerLogin = By.xpath("//a[@href='clogin.php']");
	public static By textBoxUserId = By.xpath("//input[@name='mailuid']");
	public static By textPassword = By.xpath("//input[@name='pwd']");
	public static By buttonCustomerlogin= By.xpath("//input[@name='login-submit']");
	
	
	//Actions
	public static String LoginAsCustomer(String userId, String password)
	{
		navigateURL(host);
		click(Landing_Page.loginMenu);
		click(CustomerLogin_Page.menuCustomerLogin);
		sendKeys(CustomerLogin_Page.textBoxUserId, userId);
		sendKeys(CustomerLogin_Page.textPassword, password);
		click(CustomerLogin_Page.buttonCustomerlogin);
		String welcomeMsg = getElementText(CustomerHomePage_Page.labelWelcomeMessage );
		assertEquals("Welcome David", welcomeMsg);
		return welcomeMsg;
		
		
		
	}
	

}
