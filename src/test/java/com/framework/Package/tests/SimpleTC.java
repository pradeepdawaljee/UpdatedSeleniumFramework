package com.framework.Package.tests;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTC {
	
	
	@Test
	public void firstTC() throws Exception {
		
		String url="https://demo.automationtesting.in/Register.html";
		
		System.setProperty("webdriver.chrome.driver", "F:\\Pradeep\\OfficeWork\\Codes\\SeleniumFM\\MainSeleniumAutomationFW-master\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("imagesrc")).sendKeys("F:/Pradeep/OfficeWork/Codes/SeleniumFM/MainSeleniumAutomationFW-master/Reports/MyOwnReports.html");
		driver.findElement(By.xpath("//*[@id='imagesrc']/..")).click();
		
		Robot robot=new Robot();
		
		robot.setAutoDelay(2000);
		
		String filePath="C:\\Users\\User\\Desktop\\New Text Document (2).txt";
		
		StringSelection stringSelection=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
				
		
	}

}
