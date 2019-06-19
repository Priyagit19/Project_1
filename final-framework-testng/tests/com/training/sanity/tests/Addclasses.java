package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.SigupPOM;
import com.training.pom.AddClassesPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Addclasses {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	//private SigupPOM SigupPOM;
	private AddClassesPOM AddClassesPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		AddClassesPOM = new AddClassesPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void validLoginTest() {		
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("Login");
		AddClassesPOM.classesclick();
		AddClassesPOM.AddClassesPOM();		
		screenShot.captureScreenShot("AddClasses");			
		AddClassesPOM.studentname("Demo");
		AddClassesPOM.Description_classes("Demo");
		AddClassesPOM.openclass();
		screenShot.captureScreenShot("Selectopen");	
		AddClassesPOM.opendropdown();
		//screenShot.captureScreenShot("Added");	
		AddClassesPOM.usergroup_submit();
		screenShot.captureScreenShot("Final");	
		
}
}