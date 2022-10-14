package com.framework.Package.tests;

import org.apache.commons.lang3.time.StopWatch;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.Package.core.BaseClass;
import com.framework.Package.driver.CommonMethods;
import com.framework.Package.helper.LoggerHelper;
import com.framework.Package.pageObjects.LandingScreen;
import com.framework.Package.pageObjects.Login;
import com.framework.Package.utilities.RandomDataUtility;

public class SmokeTest extends BaseClass{
	
	 private Logger log=LoggerHelper.getLogger(SmokeTest.class);
	 
	 StopWatch watch=new StopWatch();
	
	Login login=new Login();
	LandingScreen landingScreen=new LandingScreen();
	
	
	@Test(priority=1,description="Entering invalid email and  password")
	public void invalidLoginTest() throws Exception{
		extentTest=extent.startTest("TC001 invalidLogin testcase");
		String username=data.getCellData("login", "Username", 2);
		String password=data.getCellData("login", "password", 2);
		landingScreen.clickOnLoginLink();
		login.passDataToEmailField(username);
		login.passDataToPasswordField(password);
		login.clickOnLoginButton();
	}
	@DataProvider
	public Object[][] gettingDataUsingDataProvider(){
		
		String sheetName="MultipleRecordsExecute";
		return data.dataProviderGetData(sheetName);
		
	}

}
