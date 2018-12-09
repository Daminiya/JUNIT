package com.sgic.automation.demo.pagetests;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected static WebDriver driver;
	// private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	private String browser;

	protected static Properties prop = new Properties();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {

//		baseUrl = "https://www.katalon.com/";

		InputStream inputStream = null;
		inputStream = this.getClass().getClassLoader().getResourceAsStream("config/config.properties");
		prop.load(inputStream);

		browser = System.getProperty("browser");
		if (browser == null || browser.isEmpty()) {
			browser = prop.getProperty("browser");
		}
		switch (browser) {
		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "chrome":
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
			// "E:/Software/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		default:
			driver = new FirefoxDriver();
		}

		driver.get(prop.getProperty("baseUrl"));
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("timeout")), TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
	}

}