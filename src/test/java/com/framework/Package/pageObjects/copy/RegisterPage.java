package com.framework.Package.pageObjects.copy;

import org.openqa.selenium.By;

import com.framework.Package.driver.CommonMethods;

public class RegisterPage {

	By txtfirstname=By.xpath("//input[@placeholder='First Name']");
	By btnRefresh=By.xpath("//button[@value='Refresh']");
	
	
	public static By xpath(String xpathExpression){
		return By.xpath(xpathExpression);
	}

	public void passDataToFirstNameField(String firstname) throws Exception{

		CommonMethods.clear(txtfirstname,"Clearing firstname field");
		CommonMethods.sendKeys(txtfirstname, firstname,"Passing data="+firstname+" to the firstname field");

	}

	public void clickOnRegisterLink() throws Exception{
		CommonMethods.click(btnRefresh,"Clicking refresh link "+btnRefresh);
	}
	/*
	 * public void verifyLoginPage() throws Exception{
	 * CommonMethods.compareWithExpectedElement(verifyLoginText,"Comparing text="
	 * +verifyLoginText); }
	 */
}
