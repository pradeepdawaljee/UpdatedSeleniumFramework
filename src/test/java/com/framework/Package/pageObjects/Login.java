package com.framework.Package.pageObjects;

import org.openqa.selenium.By;

import com.framework.Package.driver.CommonMethods;

public class Login {

	By txtEmail=By.name("Email");
	By txtPassword=By.name("Password");
	By btnLogin=By.xpath("//input[@value='Log in']");
	By checkBoxRememberMe=By.id("RememberMe");
	By lnkForgotPassword=By.linkText("Forgot password?");
	
	
	public static By xpath(String xpathExpression){
		return By.xpath(xpathExpression);
	}

	public void passDataToEmailField(String userEmail) throws Exception{

		CommonMethods.clear(txtEmail,"Clearing email field");
		CommonMethods.sendKeys(txtEmail, userEmail,"Passing data="+userEmail+" to the email field");

	}

	public void passDataToPasswordField(String userPassword) throws Exception{

		CommonMethods.clear(txtPassword,"Clearing password field");
		CommonMethods.sendKeys(txtPassword, userPassword,"Passing data="+userPassword+" to the password field");

	}
	
	public void clickOnLoginButton() throws Exception{
		
		CommonMethods.click(btnLogin, "clicking login element "+btnLogin);
	}
	
	public void clickOnRememberMeCheckBox() throws Exception{
		CommonMethods.click(checkBoxRememberMe,"Clicking remember me check box field "+checkBoxRememberMe);
	}
	
	public void clickOnForgotPasswordLink() throws Exception{
		CommonMethods.click(lnkForgotPassword,"Clicking forgot password link "+lnkForgotPassword);
	}

}
