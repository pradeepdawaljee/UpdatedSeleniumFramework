package com.framework.Package.pageObjects;

import org.openqa.selenium.By;

import com.framework.Package.driver.CommonMethods;

public class LandingScreen {


	By lnkLogin=By.linkText("Log in");
	By lnkRegister=By.linkText("Register");

	public void clickOnLoginLink() throws Exception{
		CommonMethods.click(lnkLogin,"Clicking login link "+lnkLogin);
	}

	public void clickOnRegisterLink() throws Exception{
		CommonMethods.click(lnkRegister,"Clicking register link "+lnkRegister);
	}

}
