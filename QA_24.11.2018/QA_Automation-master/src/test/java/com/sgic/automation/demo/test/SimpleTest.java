package com.sgic.automation.demo.test;

import static org.testng.Assert.fail;

import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
//	private WebDriver driver;
	private String browser;
	private static Properties prop=new Properties();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		
		InputStream input=null;
		input= this.getClass().getClassLoader().getResourceAsStream("config/config.properties");
		prop.load(input);
		
		browser=prop.getProperty("browser");
		
		switch(browser) {
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "chrome":
//			System.setProperty()
			driver=new ChromeDriver();
			break;
			default:
				driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("timeout")),TimeUnit.SECONDS);
		
//		System.setProperty("webdriver.chrome.driver", "E:/Software/QAsof/driver/chromedriver.exe");
//		driver = new ChromeDriver();
//		baseUrl = "https://www.katalon.com/";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testOrangeHRM() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Masuk Panel'])[1]/following::span[1]"))
				.click();
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Keluar")).click();//driver.findElement(By.linkText("logout")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
