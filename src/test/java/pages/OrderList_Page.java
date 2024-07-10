package pages;

import org.openqa.selenium.By;

public class OrderList_Page {
	//locator
	public static By orders = By.xpath("//tr");
	public static By lastOrders = By.xpath("//tr[last()]");
	public static By lastColumn = By.xpath("//tr[last()]/td[last()]/a");
	

}
