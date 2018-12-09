package com.sgic.automation.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	WebElement txtUsername=driver.findElement(By.id("txtUserName"));
	WebElement txtPassword=driver.findElement(By.id("txtPassword"));
	WebElement btnLogin=driver.findElement(By.id("btnLogin"));

	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public DashBoardPage Login (String username,String password) {
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
		
		return new DashBoardPage(driver);
	}
}
