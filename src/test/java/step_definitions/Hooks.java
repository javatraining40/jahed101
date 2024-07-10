package step_definitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.Scenario;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelReader;

public class Hooks extends Base {
	
	@Before
	public void setup() throws IOException, InvalidFormatException 
	{
		config = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		config.load(fis);
		excelReader = new ExcelReader();
		testData = excelReader.getData(System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\loginData.xlsx", "loginTestData");		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		switch(config.getProperty("browser"))
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;			
		
		}
		host = config.getProperty("env");
		int seconds = Integer.parseInt(config.getProperty("implicitWait"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		System.out.println("before run");
		
	}
	@After
	public void tearDown(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[]src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
			scenario.log("This is my failed test case screenshot");
			scenario.log("scenario" + scenario.getName());			
		}
		System.out.println("after run");
		fis.close();
		driver.quit();
	}
	

}
