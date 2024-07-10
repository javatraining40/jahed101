package base;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.ExcelReader;

public class Base {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties config;
	public static String host;
	public static ExcelReader excelReader;
	public static List<Map<String, String>> testData;
	
	public static void navigateURL(String url){driver.get(url);
	}
	public static void click(By locator)
	{
		driver.findElement(locator).click();
	}
	public static void clear(By locator)
	{
		driver.findElement(locator).clear();
	}
	public static void sendKeys(By locator, String value)
	{
		driver.findElement(locator).sendKeys(value);
	}
	public static String getElementText(By locator)
	{
		WebElement element = driver.findElement(locator);
		String s = element.getText();
		return s;
	}
	public static int getTotalElementsCount(By locator)
	{
		List<WebElement> webElement = driver.findElements(locator);
		int totalCount = webElement.size();
		return totalCount;
	}
	public static void selectDropDownMenu(By locator,String textToSelect )
	{
		Select dropDownElement;
		dropDownElement = new Select(driver.findElement(locator));
		dropDownElement.selectByVisibleText(textToSelect);
	}

}
