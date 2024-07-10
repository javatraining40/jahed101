package pages;

import org.openqa.selenium.By;

import base.Base;

public class CustomerHomePage_Page extends Base {
	//Locators
	public static By labelWelcomeMessage = By.xpath("//h2[2]");
	public static By menuOrderList = By.xpath("//a[ text()=' Order List ']");
	public static By tableRowsOrderList = By.xpath("//tr");
	public static By menuOrderProduct = By.xpath("//a[text()='Order Product']");

}
