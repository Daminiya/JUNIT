package com.sgic.automation.demo.pagetests;



import org.testng.Assert;

import com.sgic.automation.demo.pages.DashBoardPage;
import com.sgic.automation.demo.pages.LoginPage;

public class LoginTest extends BaseTest {
	public void verifyAdminLogin() {
		LoginPage loginPage=new LoginPage(driver);
		DashBoardPage dashBoardPage=loginPage.Login("Admin", "admin123");
		Assert.assertTrue(dashBoardPage.isDashboardDisplayed());
	}
}
